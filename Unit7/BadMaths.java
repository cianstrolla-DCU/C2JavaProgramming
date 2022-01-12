/*
 * This class shows how to write a try catch block to detect and handle a specific Exception. In this program, this is an ArithmeticException
 * that occurs due to an attempt to divide by zero.
 */

public class BadMaths {

	public static void main(String[] args){
		
		try {
			int x = 5;
			int y = 0;
			
			int z = x / y;
			
			System.out.println(z);
			
		} catch (ArithmeticException e) {
			System.out.println("Bad maths detected!");
		}

	}

}
