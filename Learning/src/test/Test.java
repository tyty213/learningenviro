package test;

public class Test {

	public static void main(String[] args) {
		

		System.out.println(factorial(5));
		
	}
	
	public static long factorial(long n) {
		if( n <= 1) {
			return 1;
		}else {
			System.out.println(n);
			return n * factorial(n-1);
					
		}
			
	}
}
