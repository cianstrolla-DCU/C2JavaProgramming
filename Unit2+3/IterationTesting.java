
public class IterationTesting {

	public static void main(String[] args) {
		
		// for loop to print numbers 0 -> 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// initialise two variables
		int firstNum = 5;
		int secondNum = 20;
		
		// while first variable is less than second variable print first variable and increase by 1
		while (firstNum < secondNum) {
			System.out.println(firstNum);
			firstNum++;
		}
		
		
		int x = 6;
		int y = 6;
		
		// nested for loop to print a grid of numbers
		for (int i = 1; i < x; i++) {
			
			for (int p = 1; p < y; p++) {
				
				System.out.printf("%d   ", i * p);
				
			}
			
			System.out.println();
			
		}
		

	}

}
