/*
 * This class contains an "enhanced for loop". It uses the for loop syntax for looping through the elements of an array.
 */

public class EnhancedForLoop {
	
	public static void main(String[] args) {
	
		int[] positions = {3, 5, 1, 7, 8, 4, 10, 2, 6, 9};
		
		for (int nextPosition : positions)
		{
		   System.out.println("Next element is " + nextPosition);
		}
		
		
	}	
}
