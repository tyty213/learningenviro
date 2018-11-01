package enumeration;

import java.util.EnumSet;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Horse people: Horse.values()) {
			
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getAge());
			
		}
		
		System.out.println("\n Range of constants \n");
		
		for(Horse people : EnumSet.range(Horse.Kayleigh, Horse.Susan)) {
			
			System.out.printf("%s \t %s \t %s \n", people, people.getDesc(), people.getAge());
			
		}
		
	}

}
