package collections;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		
		String[] things = {"apples", "bacon", "tylor", "bacon", "chair"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		//hashsets gets rid of duplicate data, but doesn't keep an order
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);
		//linkedhashsets gets rid of duplicate data and keeps order
		Set<String> linkedset = new LinkedHashSet<String>(list);
		System.out.printf("%s ", linkedset);
	}
	
}
