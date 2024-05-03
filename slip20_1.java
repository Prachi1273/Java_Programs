<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Number to Words</title>
</head>
<body>
  <h1>Number to Words</h1>
  <form action="<%= request.getContextPath() %>/numberToWords" method="post">
    <input type="number" name="number" />
    <input type="submit" value="Convert" />
  </form>

  <%
    if (request.getParameter("number") != null) {
      int number = Integer.parseInt(request.getParameter("number"));
      String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
      String output = "";
      for (int i = 0; i < number; i++) {
        output += words[i] + " ";
      }
    %>
    <p style="color: red;"><%= output %></p>
    <%
    }
  %>
</body>
</html>
