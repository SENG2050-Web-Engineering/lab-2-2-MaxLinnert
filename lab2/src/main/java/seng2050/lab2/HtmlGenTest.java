package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HtmlGenTest extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Use HtmlGen methods to generate the page
        out.println(HtmlGen.doctype());
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("    <meta charset=\"UTF-8\">");
        out.println("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("    " + HtmlGen.title("HtmlGen Test Page"));
        out.println("    " + HtmlGen.css("https://cdn.example.com/styles.css"));
        out.println("</head>");
        out.println("<body>");
        
        out.println("    " + HtmlGen.h1("HtmlGen Class Test"));
        out.println("    " + HtmlGen.h2("Testing HTML Helper Methods"));
        out.println("    " + HtmlGen.h3("Subheading Example"));
        
        out.println("    <p>This page demonstrates the use of the HtmlGen helper class for generating HTML tags.</p>");
        out.println("    <p>The following elements were generated using HtmlGen methods:</p>");
        out.println("    <ul>");
        out.println("        <li>DOCTYPE declaration</li>");
        out.println("        <li>Title tag</li>");
        out.println("        <li>H1, H2, and H3 headings</li>");
        out.println("        <li>CSS link tag</li>");
        out.println("    </ul>");
        
        out.println("    " + HtmlGen.script("https://cdn.example.com/script.js"));
        out.println("</body>");
        out.println("</html>");
    }
}
