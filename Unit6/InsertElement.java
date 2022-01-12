/*
 * This class demonstrates inserting an element into an array and shifting the other elements down by one
 */

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		int currentSize = 8;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		System.out.println(Arrays.toString(nums));
		
		int position = 2;
		int valueToInsert = 13;

		if (currentSize < nums.length)
		{
		   currentSize++;
		   
		   for (int i = currentSize - 1; i > position; i--)
		   {
		     nums[i] = nums[i-1];
		   }

		   nums[position] = valueToInsert;
		}
		System.out.println(Arrays.toString(nums));

	}

}
