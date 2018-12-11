package polymorphicArray;

public class AnimalList {

	private Animal[] theList = new Animal[5];
	private int i = 0;
	
	public void addItem(Animal a) {
		
		if(i<theList.length) {
			
			theList[i] = a;
			
			System.out.printf("\nAnimal has been added at index %s", i);
			i++;
			
		}
		
	}
}
