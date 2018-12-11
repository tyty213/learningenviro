package polymorphism;

public class Mouse {
	
	public static void main(String[] args) {
		
		Hunter tylor = new Hunter();
		Animal dogObj = new Dog();
		Animal horseObj = new Horse();
		Animal cowObj = new Cow();
		
		System.out.println();
		
		Animal eat[] = new Animal[3];
		eat[0] = new Dog();
		eat[1] = new Horse();
		eat[2] = new Cow();
		
		for(Animal a : eat) {
				
			a.eat();
		}
		
		tylor.digest(dogObj);
		tylor.digest(horseObj);
		tylor.digest(cowObj);
	}
}
