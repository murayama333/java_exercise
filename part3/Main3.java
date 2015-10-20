public class Main3 {

    public static void main(String[] args) {
        String[] messages = {"Apple" , "Banana", "Cherry"};
        Printer printer = new HTMLPrinter(messages);
        printer.print();
    }
}
