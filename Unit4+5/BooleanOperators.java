/*
 * This program demonstrates the use of Boolean operators to compare two conditions in a single if / else if statement. 
 * Use && to ensure both conditions are true and || to ensure at least one of them are true.
 */


public class BooleanOperators {

	public static void main(String[] args) {

		int ticketType = 8;	
		double price = 0;
		int showType = 10;	
		
		if (ticketType == 1 && showType == 10) 
		{
			price = 9.50;
		} else if (ticketType == 2 && showType == 10) 
		{
			price = 6.50;
		} else 
		{
			price = 5.00;
		}
		
		
		
		System.out.println(price);

	}

}
