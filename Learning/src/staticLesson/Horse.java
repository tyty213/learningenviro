package staticLesson;

public class Horse {
	
	private String firstName;
	private String lastName;
	private static int noOfMembers = 0;
	
	public Horse(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		noOfMembers++;
		System.out.printf("Constructor for %s %s, members in the club %d\n", firstName, lastName, noOfMembers);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public static int getNoOfMembers() {
		return noOfMembers;
	}
	
}
