import java.sql.*;
import java.util.*;

public class TeacherDetails {

    public static void main(String[] args) throws Exception {

        // Create a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_database", "root", "password");

        // Create a PreparedStatement object
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Teacher (TNo, TName, Subject) VALUES (?, ?, ?)");

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Insert at least 5 records into the Teacher table
        for (int i = 0; i < 5; i++) {

            // Get the teacher details from the user
            System.out.println("Enter the teacher's TNo: ");
            int TNo = scanner.nextInt();

            System.out.println("Enter the teacher's name: ");
            String TName = scanner.next();

            System.out.println("Enter the teacher's subject: ");
            String Subject = scanner.next();

            // Set the values of the PreparedStatement object
            preparedStatement.setInt(1, TNo);
            preparedStatement.setString(2, TName);
            preparedStatement.setString(3, Subject);

            // Execute the PreparedStatement object
            preparedStatement.executeUpdate();
        }

        // Display the details of the teacher who is teaching "JAVA" subject
        PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT * FROM Teacher WHERE Subject = 'JAVA'");
        ResultSet resultSet = preparedStatement2.executeQuery();

        while (resultSet.next()) {
            System.out.println("TNo: " + resultSet.getInt("TNo"));
            System.out.println("TName: " + resultSet.getString("TName"));
            System.out.println("Subject: " + resultSet.getString("Subject"));
        }

        // Close the connection
        connection.close();
    }
}
