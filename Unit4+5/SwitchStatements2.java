/*
 * This program demonstrates the use of a switch statement where the cases are Strings instead of numbers.
 */


public class SwitchStatements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Hello";
		String answer = "";
		
		switch (word) {
			
			case "Hello": answer = "World"; System.out.println("I'm here!");
				break;
			
			case "Goodbye": answer = "For Now";
				break;
			
			default: answer = "empty";
				break;	
		
		}
		System.out.println(answer);
		
		
	}

}
