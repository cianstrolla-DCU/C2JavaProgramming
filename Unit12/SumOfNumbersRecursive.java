// This program demonstrates a recursive method that will add up the sum of all numbers up to a given int i. 
// For example: i = 5, sum = 5 + 4 + 3 + 2 + 1
public class SumOfNumberRecursive {
	
	public static void main(String[] args) {
				
		int sum = sumOfNumbers(15);
		System.out.println(sum);
		
	}


	public static int sumOfNumbers(int i) {
		
		if (i != 0) {
			
			return i + sumOfNumbers(i - 1);
			
		} else {
			
			return i;
			
		}
	}
	
	
	/*
	 * i = 3
	 * 
	 * is i not equal to zero => YES
	 * 
	 * 
	 * return 3 + 3
	 * 
	 * 				i = 2
	 * 
	 * 				is i not equal to zero ==> YES
	 * 
	 * 				return 2 + 1
	 * 
	 * 
	 * 							i = 1
	 * 
	 * 							is i not equal to zero ==> YES
	 * 
	 * 							return 1 + 0
	 * 
	 * 										i = 0
	 * 										is i not equal to zero ==> NO
	 * 
	 * 										return 0
	 */								
}
