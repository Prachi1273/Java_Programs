import java.sql.*;

public class DisplayColumnMetaData {

    public static void main(String[] args) {
        try {
            // Get a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query to get the ResultSet
            ResultSet rs = stmt.executeQuery("SELECT * FROM DONAR");

            // Get the ResultSetMetaData
            ResultSetMetaData rsmd = rs.getMetaData();

            // Get the number of columns
            int columnCount = rsmd.getColumnCount();

            // Display information about each column
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Column name: " + rsmd.getColumnName(i));
                System.out.println("Column type: " + rsmd.getColumnTypeName(i));
                System.out.println("Column size: " + rsmd.getColumnDisplaySize(i));
                System.out.println("------------------");
            }

            // Close the ResultSet, Statement, and Connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
