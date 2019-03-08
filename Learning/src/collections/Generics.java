package collections;
import java.util.*;

import javax.sound.midi.Soundbank;
public class Generics {

	public static void main(String[] args) {
		
		Integer[] iray = {1,2,3,4};
		Character[] cray = {'b','e','t','a'};
		
		printMe(iray);
		printMe(cray);
		
	}
	//generic method
	private static <T> void printMe(T[] x) {
		
		for(T i : x) {
			
			System.out.printf("%s ", i);

		}
		System.out.println();
	}
}
