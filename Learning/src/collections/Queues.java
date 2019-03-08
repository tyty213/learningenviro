package collections;
import java.util.*;
public class Queues {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<>();
		
		q.offer("First");
		q.offer("second");		//first come first served
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		//gets the first element, ie at the 'peek'
		System.out.printf("%s ", q.peek());
		System.out.println();
		//removes element with highest priority
		q.poll();
		System.out.printf("%s ", q);
	}
	
	
}
