/*
 * This program demonstrate a switch statement that compares the value of ticketType with two cases. If either of the cases are a match then
 * the price variable is updated. If there is no match, the default case is used and prints a message to the screen. An if else if statement
 * is then shown to demonstrate how this would be written.
 */


public class SwitchStatements {

	public static void main(String[] args) {
		
		int ticketType = 1;
		
		double price = 0;
		
		switch(ticketType) {
		
			case 1: price = 9.50;
				break;
			case 2: price = 6.50;
				break;
			default: System.out.println("Unknown Ticket Type.");
				break;
		}
		
		System.out.println(price);
		
		// This switch statement can also be written using if else if statements as follows:
		
//		int ticketType = 1;
//		
//		double price = 0;
//		
//		if (ticketType == 1) {
//			price = 9.50;
//		} else if (ticketType == 2) {
//			price = 6.50;
//		} else {
//			System.out.println("Unknown Ticket Type");
//		}
//		
//		System.out.println(price);
		
		
	}

}
