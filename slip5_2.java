<%@ page import="java.sql.*" %>
<%
// Connect to the database
Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "password");

// Create a statement to select the questions
Statement stmt = con.createStatement();

// Execute the statement and get the results
ResultSet rs = stmt.executeQuery("SELECT * FROM questions");

// Create a list to store the questions
List<Question> questions = new ArrayList<>();

// Iterate over the results and add the questions to the list
while (rs.next()) {
    Question question = new Question();
    question.setId(rs.getInt("id"));
    question.setQuestion(rs.getString("question"));
    question.setChoice1(rs.getString("choice1"));
    question.setChoice2(rs.getString("choice2"));
    question.setChoice3(rs.getString("choice3"));
    question.setChoice4(rs.getString("choice4"));
    question.setAnswer(rs.getString("answer"));
    questions.add(question);
}

// Close the statement and the connection
stmt.close();
con.close();

// Get the current question
int currentQuestionIndex = 0;
Question currentQuestion = questions.get(currentQuestionIndex);

// Set the current question in the session
session.setAttribute("currentQuestion", currentQuestion);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Online Multiple Choice Test</title>
</head>
<body>
    <h1>Online Multiple Choice Test</h1>

    <form action="submit.jsp" method="post">
        <ol>
            <%
            // Iterate over the questions and display them on the page
            for (Question question : questions) {
            %>
            <li>
                <%= question.getQuestion() %>
                <br />
                <input type="radio" name="answer" value="<%= question.getChoice1() %>" /> <%= question.getChoice1() %>
                <br />
                <input type="radio" name="answer" value="<%= question.getChoice2() %>" /> <%= question.getChoice2() %>
                <br />
                <input type="radio" name="answer" value="<%= question.getChoice3() %>" /> <%= question.getChoice3() %>
                <br />
                <input type="radio" name="answer" value="<%= question.getChoice4() %>" /> <%= question.getChoice4() %>
            </li>
            <%
            }
            %>
        </ol>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>
