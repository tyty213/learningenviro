package polymorphicArray;

public class Driver {

	public static void main(String[] args) {

		AnimalList ALO = new AnimalList();
		Dog dogOBJ = new Dog();
		Fish fishOBJ = new Fish();
		
		ALO.addItem(dogOBJ);
		ALO.addItem(fishOBJ);
		
	}

}
