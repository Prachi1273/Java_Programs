<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="perfectNumber.jsp" %>

<html>
<head>
  <title>Perfect Number Checker</title>
</head>
<body>
  <h1>Perfect Number Checker</h1>

  <form action="perfectNumber.jsp" method="post">
    <input type="number" name="number" placeholder="Enter a number">
    <input type="submit" value="Check">
  </form>

  <%
    String number = request.getParameter("number");

    if (number != null && !number.isEmpty()) {
      int num = Integer.parseInt(number);

      if (isPerfectNumber(num)) {
        out.println("<p>" + num + " is a perfect number.</p>");
      } else {
        out.println("<p>" + num + " is not a perfect number.</p>");
      }
    }
  %>
</body>
</html>

/*

perfect number.jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  public static boolean isPerfectNumber(int num) {
    int sum = 0;

    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }

    return sum == num;
  }
%>
*/
