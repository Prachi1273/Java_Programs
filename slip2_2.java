import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletInfoServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    // Get the client's IP address.
    String ipAddress = request.getRemoteAddr();

    // Get the client's browser type.
    String browserType = request.getHeader("User-Agent");

    // Get the server's operating system type.
    String osType = System.getProperty("os.name");

    // Get the names of currently loaded servlets.
    ServletContext servletContext = getServletContext();
    ServletRegistration[] servletRegistrations = servletContext.getServletRegistrations();
    String[] servletNames = new String[servletRegistrations.length];
    for (int i = 0; i < servletRegistrations.length; i++) {
      servletNames[i] = servletRegistrations[i].getName();
    }

    // Write the information to the response.
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet Information</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Servlet Information</h1>");
    out.println("<p>Client IP address: " + ipAddress + "</p>");
    out.println("<p>Client browser type: " + browserType + "</p>");
    out.println("<p>Server operating system type: " + osType + "</p>");
    out.println("<p>Currently loaded servlets:");
    for (String servletName : servletNames) {
      out.println("<li>" + servletName + "</li>");
    }
    out.println("</p>");
    out.println("</body>");
    out.println("</html>");
    out.close();
  }
}
