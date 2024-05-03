<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>JSP Program to Check Prime Number</title>
</head>
<body>
  <%
    // Get the input number from the user
    int number = Integer.parseInt(request.getParameter("number"));

    // Check if the number is prime
    boolean isPrime = true;
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    // Display the result
    if (isPrime) {
      out.println("<font color='red'>The number " + number + " is a prime number.</font>");
    } else {
      out.println("<font color='red'>The number " + number + " is not a prime number.</font>");
    }
  %>
</body>
</html>
