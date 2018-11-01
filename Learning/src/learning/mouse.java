package learning;

public class mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dogObj = new Dog(12, 12, 2000);
		
		Horse horseObj = new Horse("Tylor", dogObj);
		
		System.out.println(horseObj);
		
	}

}
