import java.sql.*;

public class DatabaseMetaDataExample {

    public static void main(String[] args) throws SQLException {

        // Establish a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "password");

        // Get the DatabaseMetaData object
        DatabaseMetaData databaseMetaData = connection.getMetaData();

        // Display information about the database
        System.out.println("Database Product Name: " + databaseMetaData.getDatabaseProductName());
        System.out.println("Database Product Version: " + databaseMetaData.getDatabaseProductVersion());
        System.out.println("Database Driver Name: " + databaseMetaData.getDriverName());
        System.out.println("Database Driver Version: " + databaseMetaData.getDriverVersion());

        // List all the tables in the database
        ResultSet resultSet = databaseMetaData.getTables(null, null, null, new String[]{"TABLE"});
        while (resultSet.next()) {
            System.out.println(resultSet.getString("TABLE_NAME"));
        }

        // Close the connection
        connection.close();
    }
}
