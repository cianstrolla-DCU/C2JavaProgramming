
public class FibonnaciRecursive {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(fibonacci(i) + " ");
			
		}
		System.out.println();

	}
	
	public static int fibonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		
		return fibonacci(i - 1 ) + fibonacci(i - 2);
	}

}
