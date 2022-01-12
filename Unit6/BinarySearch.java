/*
 * This class contains an implementation of a Binary Search algorithm. An array is generated in increments of .25 and a numberToFind variable
 * is set to whichever number is required to find. 
 */

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		System.out.println(Arrays.toString(nums));
		
		boolean found = false; 
		int startIndex = 0;
		int endIndex = nums.length -1; 
		int position = 0;
		double numberToFind = 0.75;
		
		while (!found && startIndex <= endIndex)
		{
		   position = (startIndex + endIndex) / 2; // find middle of
		   // next part
		   if (nums[position] == numberToFind)
		   {
		     found = true;
		   }
		   else if (nums[position] > numberToFind)
		   {
		     endIndex = position - 1;
		   }
		   else
		   {
		     startIndex = position + 1;
		   }
		}
		
		System.out.println(found);
		System.out.println(position);
	}

}
