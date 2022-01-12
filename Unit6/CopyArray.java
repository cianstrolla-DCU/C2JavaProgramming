/*
 * This class generates an array of numbers and then uses the Arrays.copyOf() method to copy the array into a new array called 'copy'.
 * It then loops through the array and prints each element.
 */

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		double[] copy = Arrays.copyOf(nums, nums.length);
		
		for (int i = copy.length-1; i > 0; i--) {
			System.out.print(copy[i] + " ");
		}


	}

}
