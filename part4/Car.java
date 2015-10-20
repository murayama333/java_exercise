public class Car{
    String name;
    int gas;

    Car(String name, int gas){
        this.name = name;
        this.gas = gas;
    }

    void move(){
        if (gas > 0) {
            System.out.println(name + ": Boom");
            gas--;
        } else {
            System.out.println(name + ": Stop");
        }
    }
}
