package composition;

public class Dog {

	private int day;
	private int month;
	private int year;
	
	public Dog(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.printf("The constructor for this is %s \n", this);
		
	}
	
	@Override
	public String toString() {
		
		return String.format("%d/%d/%d", day, month, year);
		
	}
	
}
