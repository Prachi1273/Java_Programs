import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentDetailsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        // Get the student details from the request
        String seatNo = request.getParameter("seatNo");
        String studName = request.getParameter("studName");
        String studClass = request.getParameter("studClass");
        int totalMarks = Integer.parseInt(request.getParameter("totalMarks"));

        // Calculate the percentage
        double percentage = (double) totalMarks / 500 * 100;

        // Calculate the grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Set the response content type
        response.setContentType("text/html");

        // Write the student details to the response
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Details</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Student Details</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Seat No.</th><th>Student Name</th><th>Class</th><th>Total Marks</th><th>Percentage</th><th>Grade</th></tr>");
        out.println("<tr><td>" + seatNo + "</td><td>" + studName + "</td><td>" + studClass + "</td><td>" + totalMarks + "</td><td>" + percentage + "</td><td>" + grade + "</td></tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
