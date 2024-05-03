import java.sql.*;

public class ScrollableResultSetExample {

    public static void main(String[] args) {
        // Connect to the database
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

        // Create a Statement object
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        // Execute a query to retrieve all teachers from the Teacher table
        ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher");

        // Print the results of the query
        while (rs.next()) {
            System.out.println(rs.getInt("TID") + ", " + rs.getString("TName") + ", " + rs.getInt("Salary"));
        }

        // Move the cursor to the last row in the ResultSet
        rs.last();

        // Print the results of the query in reverse order
        while (rs.previous()) {
            System.out.println(rs.getInt("TID") + ", " + rs.getString("TName") + ", " + rs.getInt("Salary"));
        }

        // Close the ResultSet, Statement, and Connection objects
        rs.close();
        stmt.close();
        conn.close();
    }
}
