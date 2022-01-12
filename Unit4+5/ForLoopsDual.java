/*
 * This program demonstrates the initialisation of two variables within the for loop. The first variable i, counts up from 0 to the length of
 * the string, the second variable j, counts backwards from the length of the String to 0.
 */


public class ForLoopsDual {

	public static void main(String[] args) {
		
		int n = 1000;
		
		int numberOfRuns = 0;
		
		for (int i = 0, j = n; i < n && j > 0; i++, j--) {
			
			numberOfRuns++;
			
		}
		
		System.out.println(numberOfRuns);

	}

}
