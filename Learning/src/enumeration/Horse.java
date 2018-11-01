package enumeration;

public enum Horse {

	Tylor("funny", "17"),
	Kayleigh("cunt", "16"),
	Mitchell("Junkie", "18"),
	Steven("Auld", "28?"),
	Susan("Lecturer", "30?"),
	Lewis("Bro", "16");

	private final String DESC;
	private final String AGE;
	
	Horse(String description, String howOld){
		
		DESC = description;
		AGE = howOld;
		
	}
	
	public String getDesc() {
		
		return DESC;
		
	}
	
	public String getAge() {
		
		return AGE;
		
	}
}
