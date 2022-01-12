/*
 * This class swaps two elements in an array through the use of a temporary placeholder variable.
 */

import java.util.Arrays;

public class SwappingElements {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		// int currentSize = 9;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		System.out.println(Arrays.toString(nums));

		int i = 2;
		int j = 4;
		
		double temp = nums[i];  // store value from nums[i] in temp 
		nums[i] = nums[j];   // set nums[i] to value at nums[j]; 
		nums[j] = temp;      // set nums[j] to temp value
		
		System.out.println(Arrays.toString(nums));
	}

}
