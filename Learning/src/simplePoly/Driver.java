package simplePoly;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] theList = new Animal[2];
		Dog dogOBJ = new Dog();
		Fish fishOBJ = new Fish();
		
		theList[0] = dogOBJ;
		theList[1] = fishOBJ;
		
		for(Animal x : theList) {
			
			x.noise();
			
		}
		
	}

}
