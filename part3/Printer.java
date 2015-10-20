public class Printer {

    String[] messages;

    Printer(String[] messages){
        this.messages = messages;
    }

    void print(){
        for(int i = 0; i < messages.length; i++){
            System.out.println(messages[i]);
        }
    }
}
