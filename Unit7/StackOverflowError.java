/*
 * This class demonstrates a StackOverflowError. The print method recursively calls itself until the maximum number of calls is reached.
 * At this point, a StackOverflowError is created and the program is terminated.
 */


public class StackOverflowError {

	public static void main(String[] args) {
		
		String myString = "Hello world";
		
		print(myString);

	}

	private static void print(String myString) {
		
		print(myString);
		
	}

}
