<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>

<%
// Connect to the database
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/patient", "root", "password");

// Create a statement
Statement stmt = conn.createStatement();

// Execute the query
ResultSet rs = stmt.executeQuery("select * from patient;");
Class.forName("org.postgresql.Driver");
// Create a table to display the results
%>

<html>
<head>
<title>Patient Details</title>
</head>
<body>

<h1>Patient Details</h1>

<table border="1">
<tr>
<th>PNo</th>
<th>PName</th>
<th>Address</th>
<th>Age</th>
<th>Disease</th>
</tr>

<%
// Iterate over the results and display them in the table
while(rs.next()) {
%>

<tr>
<td><%= rs.getInt("PNo") %></td>
<td><%= rs.getString("PName") %></td>
<td><%= rs.getString("Address") %></td>
<td><%= rs.getInt("Age") %></td>
<td><%= rs.getString("Disease") %></td>
</tr>

<%
}

// Close the result set, statement, and connection
rs.close();
stmt.close();
conn.close();
%>

</table>

</body>
</html>
