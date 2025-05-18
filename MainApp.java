import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Wi-Fi Access Logger");

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel phoneLabel = new JLabel("Mobile:");
        JLabel macLabel = new JLabel("MAC Address:");
        JLabel zoneLabel = new JLabel("Zone:");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField phoneField = new JTextField();
        JTextField macField = new JTextField();
        JTextField zoneField = new JTextField();

        JButton registerBtn = new JButton("Register & Log In");
        JButton logoutBtn = new JButton("Log Out");
        JButton viewLogsBtn = new JButton("View Logs");

        nameLabel.setBounds(20, 20, 100, 25);
        nameField.setBounds(130, 20, 200, 25);
        emailLabel.setBounds(20, 50, 100, 25);
        emailField.setBounds(130, 50, 200, 25);
        phoneLabel.setBounds(20, 80, 100, 25);
        phoneField.setBounds(130, 80, 200, 25);
        macLabel.setBounds(20, 110, 100, 25);
        macField.setBounds(130, 110, 200, 25);
        zoneLabel.setBounds(20, 140, 100, 25);
        zoneField.setBounds(130, 140, 200, 25);

        registerBtn.setBounds(40, 180, 150, 30);
        logoutBtn.setBounds(200, 180, 100, 30);
        viewLogsBtn.setBounds(130, 220, 150, 30);

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(phoneLabel); frame.add(phoneField);
        frame.add(macLabel); frame.add(macField);
        frame.add(zoneLabel); frame.add(zoneField);
        frame.add(registerBtn); frame.add(logoutBtn); frame.add(viewLogsBtn);

        frame.setSize(400, 330);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        registerBtn.addActionListener(e -> {
            try (Connection conn = DBConnection.getConnection()) {
                String insertUser = "INSERT INTO users (name, email, mobile, device_mac) VALUES (?, ?, ?, ?) ON CONFLICT (device_mac) DO NOTHING RETURNING user_id";
                PreparedStatement userStmt = conn.prepareStatement(insertUser, Statement.RETURN_GENERATED_KEYS);

                userStmt.setString(1, nameField.getText());
                userStmt.setString(2, emailField.getText());
                userStmt.setString(3, phoneField.getText());
                userStmt.setString(4, macField.getText());

                userStmt.executeUpdate();

                ResultSet rs = userStmt.getGeneratedKeys();
                int userId = -1;
                if (rs.next()) {
                    userId = rs.getInt(1);
                } else {
                    String getIdQuery = "SELECT user_id FROM users WHERE device_mac = ?";
                    PreparedStatement getIdStmt = conn.prepareStatement(getIdQuery);
                    getIdStmt.setString(1, macField.getText());
                    ResultSet idRs = getIdStmt.executeQuery();
                    if (idRs.next()) userId = idRs.getInt(1);
                }

                String insertLog = "INSERT INTO access_logs (user_id, login_time, zone, data_used_mb) VALUES (?, ?, ?, 0.0)";
                PreparedStatement logStmt = conn.prepareStatement(insertLog);
                logStmt.setInt(1, userId);
                logStmt.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
                logStmt.setString(3, zoneField.getText());
                logStmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Access log added for user ID: " + userId);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });

        logoutBtn.addActionListener(e -> {
            try (Connection conn = DBConnection.getConnection()) {
                String updateLog = "UPDATE access_logs SET logout_time = ?, data_used_mb = ? WHERE user_id = (SELECT user_id FROM users WHERE device_mac = ?) AND logout_time IS NULL";
                PreparedStatement logoutStmt = conn.prepareStatement(updateLog);
                logoutStmt.setTimestamp(1, Timestamp.valueOf(LocalDateTime.now()));
                logoutStmt.setDouble(2, Math.random() * 500); // Simulate data usage
                logoutStmt.setString(3, macField.getText());

                int updated = logoutStmt.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(null, "Logout recorded.");
                } else {
                    JOptionPane.showMessageDialog(null, "No active session found.");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });

        viewLogsBtn.addActionListener(e -> {
            try (Connection conn = DBConnection.getConnection()) {
                String query = "SELECT u.name, u.device_mac, a.zone, a.login_time, a.logout_time, a.data_used_mb FROM access_logs a JOIN users u ON a.user_id = u.user_id ORDER BY a.login_time DESC";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                String[] columnNames = {"Name", "MAC Address", "Zone", "Login", "Logout", "Data Used (MB)"};
                rs.last();
                int rowCount = rs.getRow();
                rs.beforeFirst();

                String[][] data = new String[rowCount][6];
                int i = 0;
                while (rs.next()) {
                    data[i][0] = rs.getString("name");
                    data[i][1] = rs.getString("device_mac");
                    data[i][2] = rs.getString("zone");
                    data[i][3] = rs.getTimestamp("login_time").toString();
                    Timestamp logout = rs.getTimestamp("logout_time");
                    data[i][4] = (logout != null) ? logout.toString() : "-";
                    data[i][5] = rs.getDouble("data_used_mb") + "";
                    i++;
                }

                JTable table = new JTable(data, columnNames);
                JScrollPane scrollPane = new JScrollPane(table);

                JFrame logFrame = new JFrame("Access Logs");
                logFrame.add(scrollPane);
                logFrame.setSize(800, 300);
                logFrame.setVisible(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        });
    }
}

