/*
 * This program demonstrates the creation of a method called printer() which prints a grid of numbers from 1 to 100
 */


public class Methods {

	public static void main(String[] args) 
	{
		printer();
		
	}
	
	public static void printer() {
		
		for (int row = 1; row <= 10; row++) {
			
			for (int col = 1; col <= 10; col++) {
				
				System.out.printf("%3d ", row * col);
			}
			System.out.println();
			
		}
		
		
	}
	
	
}
