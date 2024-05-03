<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Voter Eligibility Checker</title>
</head>
<body>
<h1>Voter Eligibility Checker</h1>
<form action="checkEligibility.jsp" method="post">
Name: <input type="text" name="name" />
Age: <input type="number" name="age" />
<input type="submit" value="Check Eligibility" />
</form>
</body>
</html>


checkEligibility.jsp

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String name = request.getParameter("name");
int age = Integer.parseInt(request.getParameter("age"));

if (age >= 18) {
%>
<p>Congratulations, <%= name %>, you are eligible to vote!</p>
<%
} else {
%>
<p>Sorry, <%= name %>, you are not eligible to vote. You must be at least 18 years old.</p>
<%
}
%>
