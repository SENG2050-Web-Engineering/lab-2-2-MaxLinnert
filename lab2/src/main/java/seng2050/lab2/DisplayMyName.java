package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayMyName extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        displayName(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        displayName(request, response);
    }
    
    private void displayName(HttpServletRequest request, HttpServletResponse response)
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
        out.println("    <title>Name Display</title>");
        out.println("</head>");
        out.println("<body>");
        
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            out.println("    <h1>Name Display</h1>");
            out.println("    <p>Please provide both first name and last name.</p>");
            out.println("    <p><a href=\"nameform.html\">Back to form</a></p>");
        } else {
            out.println("    <h1>Welcome, " + escapeHtml(firstName) + " " + escapeHtml(lastName) + "!</h1>");
            out.println("    <p>Your name has been received successfully.</p>");
            out.println("    <p><a href=\"nameform.html\">Back to form</a></p>");
        }
        
        out.println("</body>");
        out.println("</html>");
    }
    
    private String escapeHtml(String text) {
        if (text == null) {
            return "";
        }
        return text.replace("&", "&amp;")
                   .replace("<", "&lt;")
                   .replace(">", "&gt;")
                   .replace("\"", "&quot;")
                   .replace("'", "&#39;");
    }
}
