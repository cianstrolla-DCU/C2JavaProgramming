/*
 * This programs demonstrates the use of the conditional operator and compares it against a traditional if statement.
 */


public class ConditionalOperator {

	public static void main(String[] args) {
		
		
		String ticketType = "car";
		
		double price = ticketType.equals("premium") ? 9.00 : 6.50; // conditional statement
		
		System.out.println(price);
		
		// The conditional statement above can be written as an if statement as follows:
		
		if (ticketType.equals("premium")) {
			price = 9.00;
		} else {
			price = 6.50;
		}
		
		System.out.println(price);

	}

}
