public class FactorialRecursive {

	public static void main(String[] args) {
			
		int result = factorial(10);
		
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		
		if (n == 1) {
			return 1;
		}
		
		return n * factorial(n - 1);
	}

}

/*
 * n = 2
 * 
 * is n = 1? => NO
 * 
 * return 2 * 1
 * 
 * 				n = 1
 * 
 * 				is n = 1? => YES
 * 
 * 				return 1
 * 
 * 
 */
