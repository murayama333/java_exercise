public class Main2 {

    public static void main(String[] args) {
        String[] messages = {"Apple" , "Banana", "Cherry"};
        Printer printer = new LinePrinter(messages);
        printer.print();
    }
}
