public class HybridCar extends Car{

    int electric;

    HybridCar(String name, int gas, int electric){
        super(name, gas);
        this.electric = electric;
    }

    void move(){
        if (gas > 0) {
            System.out.println(name + ": Boom");
            gas--;
        } else if (electric > 0){
            System.out.println(name + ": Boom!!");
            electric--;
        } else {
            System.out.println(name + ": Stop");
        }
    }
}
