package polymorphism;

public class Mouse {
	public static void main(String[] args) {
		
		Animal eat[] = new Animal[2];
		eat[0] = new Dog();
		eat[1] = new Horse();
		
		for(int i = 0; i<2 ; i++) {
			
			eat[i].eat();
			
		}
	}
}
