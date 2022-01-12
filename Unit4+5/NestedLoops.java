/*
 * This program demonstrates a nested for loop. The outer loops counts from 1 to 10, the inner loop also counts from 1 to 10. For each iteration
 * of the outer loop, the inner loop iterates fully i.e. 10 times. The two counters are multiplied together and printed to the screen. This results
 * in the two loops iterating a total of 10 * 10 times, totalling 100 iterations. 
 */


public class NestedLoops {

	public static void main(String[] args) {
		
		printTable();
	}

	public static void printTable() {
		
		
		for (int row = 1; row <= 6; row++) 
		{
			
	    	for (int col = 1; col <= 8; col++) 
	    	{
	    		
	    			System.out.printf("%,7d ", row * col * 100);
	    		
	    	}
	    	
	    	System.out.println();
		}
		
	}
	
}
