/*
 * This class generates and displays the content of an array.
 */

public class DisplayContents {

	public static void main(String[] args) {
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		for (int i = nums.length-1; i > 0; i--) {
			System.out.print(nums[i]);
		}

	}

}
