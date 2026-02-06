package seng2050.lab2;

public class HtmlGen {
    
    /**
     * Generates an HTML5 doctype declaration
     */
    public static String doctype() {
        return "<!DOCTYPE html>";
    }
    
    /**
     * Generates an HTML title tag
     */
    public static String title(String titleText) {
        return "<title>" + escapeHtml(titleText) + "</title>";
    }
    
    /**
     * Generates an H1 heading
     */
    public static String h1(String text) {
        return "<h1>" + escapeHtml(text) + "</h1>";
    }
    
    /**
     * Generates an H2 heading
     */
    public static String h2(String text) {
        return "<h2>" + escapeHtml(text) + "</h2>";
    }
    
    /**
     * Generates an H3 heading
     */
    public static String h3(String text) {
        return "<h3>" + escapeHtml(text) + "</h3>";
    }
    
    /**
     * Generates a script tag with external source
     */
    public static String script(String src) {
        return "<script src=\"" + escapeHtml(src) + "\"></script>";
    }
    
    /**
     * Generates a CSS link tag
     */
    public static String css(String href) {
        return "<link rel=\"stylesheet\" href=\"" + escapeHtml(href) + "\">";
    }
    
    /**
     * Escapes HTML special characters to prevent XSS
     */
    private static String escapeHtml(String text) {
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
