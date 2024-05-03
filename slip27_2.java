import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ChangeSessionTimeoutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Get the current session
        HttpSession session = request.getSession();

        // Get the new inactive time interval in seconds
        int newInactiveInterval = Integer.parseInt(request.getParameter("newInactiveInterval"));

        // Set the new inactive time interval
        session.setMaxInactiveInterval(newInactiveInterval);

        // Send a response to the client
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Change Session Timeout</title></head><body>");
        out.println("<h1>Session timeout has been changed to " + newInactiveInterval + " seconds.</h1>");
        out.println("</body></html>");
        out.close();
    }
}
