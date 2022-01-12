/*
 * This program demonstrates a Do While loop. Note: with a Do While loop, the condition is checked at the end of the statement execution.
 * This means that the loop will always run AT LEAST ONCE. Change double number to be greater than max and see what happens.
 */

public class DoWhileLoops {

	public static void main(String[] args) {

		double number = 10;
		int max = 100;
		
		do {
			number = number * 1.2;
			System.out.println(number);
		} while (number < max);

		
	}
}
		
		
