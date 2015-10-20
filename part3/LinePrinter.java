public class LinePrinter extends Printer {

    LinePrinter(String[] messages) {
        super(messages);
    }
    void print(){
        for (int i = 0 ; i < messages.length; i++) {
            System.out.println((i + 1) + ":" + messages[i]);
        }
    }
}
