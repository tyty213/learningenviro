package learning;

public class mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse horseObj = new Horse(10);

		for(int i = 0; i<5; i++) {
			
			horseObj.add();
			System.out.printf("%s", horseObj);
		}
	}

}
