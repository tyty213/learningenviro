package polymorphism;

public class Mouse {
	
	public static void main(String[] args) {
		
		Hunter tylor = new Hunter();
		Animal animalObj = new Animal();
		Animal dogObj = new Dog();
		Animal cowObj = new Cow();
		
		tylor.digest(animalObj);
		tylor.digest(dogObj);
		tylor.digest(cowObj);
		
		System.out.println();
		
		Animal eat[] = new Animal[3];
		eat[0] = new Dog();
		eat[1] = new Horse();
		eat[2] = new Cow();
		
		for(Animal a : eat) {
			
			a.eat();
		}
	}
}
