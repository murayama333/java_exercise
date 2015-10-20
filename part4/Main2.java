public class Main2{
	public static void main(String[] args){

		Car prius = new HybridCar("prius", 5, 5);
		Car freed = new Car("freed", 5);
		for(int i = 0; i < 6; i++){
			prius.move();
			freed.move();
		}
	}
}
