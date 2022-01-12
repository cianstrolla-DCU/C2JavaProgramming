/*
 * This program demonstrates a while loop. Note: the condition of the while loop is checked BEFORE the statements are executed. This means that
 * the condition must always be true in order for the statement to execute.
 */


public class WhileLoops {

	public static void main(String[] args) {
		
		double number = 10;
		int max = 100;
		
		while (number < max) {
			number = number * 1.2;
			System.out.println(number);
		}

	}

}
