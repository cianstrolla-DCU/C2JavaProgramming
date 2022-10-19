// example of input/output using the Scanner and System.out

import java.util.Scanner;

public class InputOutputTesting {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int number = in.nextInt();
		
		System.out.println("Enter your name: ");
		
		String name = in.next();
		
		System.out.println("You Entered:");
		
		System.out.println(number);
		System.out.println(name);
		
		int secondNumber = in.nextInt();
		
		System.out.println(secondNumber);
		
		in.close();
		

	}

}
