public class Main1{
	public static void main(String[] args){

		Car freed = new Car("freed", 5);
		Car march = new Car("march", 2);

		for(int i = 0; i < 3; i++){
			freed.move();
			march.move();
		}
	}
}
