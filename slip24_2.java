<%@ page import="java.sql.*" %>

<%

String username = request.getParameter("username");
String password = request.getParameter("password");

Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

try {
  // Connect to the database
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");

  // Create a statement
  stmt = conn.createStatement();

  // Execute a query to select the user with the given username and password
  rs = stmt.executeQuery("SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'");

  // If the user is found, display a "Login Successfully" message
  if (rs.next()) {
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Login Successful</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Login Successful</h1>");
    out.println("</body>");
    out.println("</html>");
  } else {
    // If the user is not found, display a "Login Failed" message
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Login Failed</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Login Failed</h1>");
    out.println("</body>");
    out.println("</html>");
  }

} catch (SQLException e) {
  // Handle any errors that occur
  e.printStackTrace();
} finally {
  // Close the connection, statement, and result set
  if (rs != null) {
    rs.close();
  }
  if (stmt != null) {
    stmt.close();
  }
  if (conn != null) {
    conn.close();
  }
}

%>
