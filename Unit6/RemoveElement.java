/*
 * This class generates an array and then removes an element. It then shifts all elements to the left by one position and duplicates the 
 * final element. The currentSize variable is then decremented by 1 to reflect this change. This method preserves the order of the elements
 */

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		int currentSize = 9;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		System.out.println(Arrays.toString(nums));
		
		int position = 2;
		
		for (int i = position + 1; i < currentSize; i++)
		{
		   nums[i - 1] = nums[i];
		}
		currentSize--; 
		
		System.out.println(Arrays.toString(nums));
		
	}

}
