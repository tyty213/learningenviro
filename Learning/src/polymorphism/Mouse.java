package polymorphism;

public class Mouse {
	
	public static void main(String[] args) {
		
		Hunter tylor = new Hunter();
		Animal animalObj = new Animal();
		Animal dogObj = new Dog();
		
		tylor.digest(animalObj);
		tylor.digest(dogObj);
		
	}
}
