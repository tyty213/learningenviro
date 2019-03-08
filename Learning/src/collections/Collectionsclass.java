package collections;

import java.util.*;

public class Collectionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] things = {"apples" , "oranges", "bananas", "eggs", "oranges", "olives"};
		List<String> list1 = Arrays.asList(things);

		//sort list ascending
		Collections.sort(list1);
		System.out.printf("Asc: %s\n", list1);
		//sort list descending
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("Desc: %s\n", list1);
		//reverse the order of the list
		Collections.reverse(list1);
		System.out.printf("Reversed: %s\n", list1);

		//creating a copy of previous list and array
		String[] newthings = new String[things.length];
		List<String> list1copy = Arrays.asList(newthings);
		
		Collections.copy(list1copy, list1);	
		System.out.println("Copy of list1: " + list1copy);
		
		//finding the frequency
		System.out.println("Frequeny: " + Collections.frequency(list1, "oranges"));
		
		//dijoint - would return true if there were no similarities between the lists
		System.out.println("Disjoint? " + Collections.disjoint(list1, list1copy)); 
	}

}
