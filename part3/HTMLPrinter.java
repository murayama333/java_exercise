public class HTMLPrinter extends Printer {
    HTMLPrinter(String[] messages){
        super(messages);
    }

    void print(){
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<ul>");
        for (int i = 0 ; i < messages.length; i++) {
            System.out.println("<li>" + messages[i] + "</li>");
        }
        System.out.println("</ul>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
