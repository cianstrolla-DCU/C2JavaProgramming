/*
 * This class demonstrates the creation of an array of integers and prints the contents to the screen.
 */

public class ArrayDemo {

	public static void main(String[] args) {
		
//		int[] positions = new int[10];
//		int currentSize = 5;
		
		int[] positions = {3, 5, 1, 7, 8, 4, 10, 2, 6, 9};
		
		 
		System.out.println(positions[1]);
		
		
		int positionsLength = positions.length;
		
		for (int i = 0; i < positionsLength; i++) {
			System.out.println(positions[i]);
		}
		
		
		
		
		
	}

}
