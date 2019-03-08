package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		String[] things = {"chair", "bed", "desk", "PintGlass"};
		List<String> list1 = new ArrayList<String>();
		
		//adding array stuff to the list1
		for(String x : things) {
			list1.add(x);
		}
	
		String[] morethings = {"bed", "desk"};
		List<String> list2 = new ArrayList<String>();
		
		//adding array stuff to the list2
		for(String y : morethings) {
			list2.add(y);
		}
		
		//prints out list1
		for(int i = 0; i <list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
	
		editList(list1, list2);
		System.out.println();
		
		//prints out list1 with removed items
		for(int i = 0; i <list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
	}
		
		public static void editList(Collection <String> l1, Collection<String> l2) {
			Iterator<String> iter = l1.iterator();
			//while there is more items check if items match, if so delete
			while(iter.hasNext()) {
				if(l2.contains(iter.next())) {
					iter.remove();
				}
			}
		}
}
