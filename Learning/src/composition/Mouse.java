package composition;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dogObj = new Dog(13, 12, 2000);
		
		Horse horseObj = new Horse("Tylor", dogObj);
		
		System.out.println(horseObj);
		
	}

}
