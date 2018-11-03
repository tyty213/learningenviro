package staticLesson;

public class Mouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse member1 = new Horse("Tylor", "Graham");
		Horse member2 = new Horse("Lewis", "Graham");
		Horse member3 = new Horse("Mitchell", "Houston");
		Horse member4 = new Horse("Kayleigh", "Dillett");
		
		System.out.println();
		System.out.println(member1.getFirstName());
		System.out.println(member4.getLastName());
		System.out.println(Horse.getNoOfMembers());
	}

}
