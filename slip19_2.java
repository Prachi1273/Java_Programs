import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Connect to the database
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Prepare a statement to search for the user in the database
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            statement.setString(1, username);
            statement.setString(2, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Execute the statement and get the results
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the user was found in the database
        if (resultSet.next()) {
            // The user was found, so display a welcome message
            PrintWriter out = response.getWriter();
            out.println("<h1>Welcome, " + username + "</h1>");
        } else {
            // The user was not found, so display an error message
            PrintWriter out = response.getWriter();
            out.println("<h1>Invalid username or password</h1>");
        }

        // Close the connection
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

CREATE TABLE users (
    id INT NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);
