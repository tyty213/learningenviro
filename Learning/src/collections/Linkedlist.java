package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		
		String[] things = {"orange" , "apples", "banaNAS", "bacon", "egg"};
		List<String> list1 = new LinkedList<String>();
		
		for(String x : things) {
			list1.add(x);
		}
		
		String[] moreThings = {"sausage", "egg", "bananas", "chair"};
		List<String> list2 = new LinkedList<String>();
		
		for(String y : moreThings) {
			list2.add(y);
		}
		
		list1.addAll(list2);
		
		list2 = null;
		
		printMe(list1);
		removeThing(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
	}
	
	//printMe method
	private static void printMe(List<String> l1) {
		
		for(String b : l1) {
			System.out.printf("%s ", b);
		}
		System.out.println();
		
	}
	
	private static void removeThing(List<String> l1, int firstPos, int secondPos) {
		
		l1.subList(firstPos, secondPos).clear();
		
	}
	
	private static void reverseMe(List<String> l1) {
		
		ListIterator<String> iter = l1.listIterator(l1.size());
		
		while(iter.hasPrevious()) {
			System.out.printf("%s ", iter.previous());
		}
		
	}
}
