/*
 * This class provides an implementation of a Linear Search algorithm. It searches through an array element by element and check if 
 * the current number matches the number that is required to find.
 */

public class LinearSearch {

	public static void main(String[] args) {
		
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		double numberToFind = 1.75; 
		boolean found = false;
		int position = 0;
		
		for (double nextNumber : nums) {
			if (nextNumber == numberToFind) {
				found = true;
				break;
			}
			position++;
		}

		
		if (found == true) {
		   System.out.println(numberToFind + " is at position " + position);
		} else {
		   System.out.println(numberToFind + " was not found in the array");
		}


	}

}
