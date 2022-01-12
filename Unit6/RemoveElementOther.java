/*
 * This class generates an array and then removes an element. Instead of shifting all other elements to the left by one position, it 
 * copies the final element into the position that of the removed element. This method does not preserve the order of the elements.
 */

import java.util.Arrays;

public class RemoveElementOther {

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
		
		nums[position] = nums[currentSize - 1]; currentSize--;
		
		System.out.println(Arrays.toString(nums));
		
	}

}
