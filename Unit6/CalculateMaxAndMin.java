/*
 * This class uses a common method of finding the largest number in an array. A variable 'largest' is set to the value of the first 
 * position in the array. Then, looping through the array, compare if the current number is greater than 'largest'. If it is, change
 * largest to be this number
 */

public class CalculateMaxAndMin {

	public static void main(String[] args) {
		
		int[] ages = {34, 53, 29, 19, 42, 66};
		
		int largest = ages[0];
	
		for (int i = 1; i < ages.length; i++)
		{
			if (ages[i] > largest)
			{
				largest = ages[i];
			}
		}
		
		System.out.println(largest);

	}

}
