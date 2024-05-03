import java.sql.*;

public class DeleteEmployee {

    public static void main(String[] args) {
        // Get the employee ID from the command line
        int empId = Integer.parseInt(args[0]);

        // Connect to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "password");
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Prepare the SQL statement
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM employees WHERE ENo = ?");
            stmt.setInt(1, empId);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Execute the SQL statement
        int rowsAffected = 0;
        try {
            rowsAffected = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Close the connection
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(1);
        }

        // Print the number of rows affected
        System.out.println(rowsAffected + " rows affected");
    }
}
