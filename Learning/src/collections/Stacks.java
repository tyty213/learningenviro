package collections;
import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> s) {
		
		if(s.isEmpty()) {
			System.out.println("Theres nothing in the stack");
		}else {
			System.out.printf("%s TOP\n", s);
		}
		
	}
}
