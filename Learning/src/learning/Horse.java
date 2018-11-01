package learning;

public class Horse {

	private String name;
	private Dog birthday;
	
	public Horse(String theName, Dog theBirthday) {
		
		name = theName;
		birthday = theBirthday;
		
	}
	
	public String toString() {
		
		return String.format("My name is %s, My birthday is %s", name, birthday);
	}
	
}
