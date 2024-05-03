import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Get the customer number from the request.
    String customerNumber = request.getParameter("customerNumber");

    // Search for the customer in the database.
    // ...

    // If the customer is found, return the customer details to the user.
    if (customer != null) {
      // ...
    } else {
      // Display an error message.
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Error</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Customer not found</h1>");
      out.println("</body>");
      out.println("</html>");
    }
  }
}
