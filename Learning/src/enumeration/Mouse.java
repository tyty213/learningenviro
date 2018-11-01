package enumeration;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Horse people: Horse.values()) {
			
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getAge());
			
		}
		
	}

}
