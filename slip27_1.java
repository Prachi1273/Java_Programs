import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class CollegeDetails extends JFrame {

    private JTable table;
    private JScrollPane scrollPane;

    public CollegeDetails() {
        super("College Details");

        // Create a database connection
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Create a statement
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Execute the query
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM college");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Create the JTable
        table = new JTable(resultSet, new CollegeTableModel());

        // Add the JTable to a JScrollPane
        scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        add(scrollPane);

        // Set the size of the JFrame
        setSize(500, 500);

        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new CollegeDetails();
    }
}

class CollegeTableModel extends AbstractTableModel {

    private String[] columnNames = {"CID", "CName", "address", "Year"};
    private Object[][] data;

    public CollegeTableModel() {
        // Get the data from the database
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Create a statement
        Statement statement = null;
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Execute the query
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery("SELECT * FROM college");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Get the number of rows and columns
        int rows = 0;
        int columns = 0;
        try {
            rows = resultSet.getRow();
            columns = resultSet.getMetaData().getColumnCount();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Create the data array
        data = new Object[rows][columns];

        // Iterate over the result set and populate the data array
        int i = 0;
        try {
            while (resultSet.next()) {
                for (int j = 0; j < columns; j++) {
                    data[i][j] = resultSet.getObject(j + 1);
                }
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
}
