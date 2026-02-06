package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Get parameters from request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        
        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    <title>Greeting</title>");
        out.println("</head>");
        out.println("<body>");
        
        if (firstName == null || lastName == null) {
            out.println("    <h1>Greeting Servlet</h1>");
            out.println("    <p>Please provide both firstName and lastName parameters.</p>");
            out.println("    <p>Example: <a href=\"/GreetingServlet?firstName=John&lastName=Doe\">/GreetingServlet?firstName=John&lastName=Doe</a></p>");
        } else {
            out.println("    <h1>Welcome, " + firstName + " " + lastName + "!</h1>");
            out.println("    <p>We are delighted to have you visit our servlet.</p>");
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
