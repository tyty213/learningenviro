package consants;

public class Horse {

	private int sum;
	private final int NUMBER;
	
	public Horse(int NUMBER) {
		
		this.NUMBER = NUMBER;
		
	}
	
	public void add() {
		
		sum += NUMBER;
		
	}
	
	@Override
	public String toString() {
		
		return String.format("sum = %d\n", sum);
		
	}
}
