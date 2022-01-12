/*
 * This class generates an array and then calculates the sum of all the elements and the average of all the elements.
 */

public class CalculateSumAndAverage {

	public static void main(String[] args) {
		
		//creating an array that increments by .25
		
		double increment = 0.25; 
		double[] nums = new double[9]; 
		double nextVal = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
		   nums[i] = nextVal; 
		   nextVal += increment;
		}
		
		double sum = 0;
		for (double element : nums)
		{
		   sum += element;
		}
		double average = 0; 
		if (nums.length > 0)
		{
		   average = sum / nums.length;
		}
		
		System.out.println(sum);
		System.out.println(average);


	}

}
