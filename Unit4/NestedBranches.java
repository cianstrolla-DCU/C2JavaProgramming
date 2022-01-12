/*
 * This program demonstrates a nested if statement that checks the value of ticketType and then checks the showType. Based on the combination
 * of these values, a specific price is stored in the price variable and is then printed to the screen.
 */

public class NestedBranches {

	public static void main(String[] args) {
		
		int ticketType = 1;	
		double price = 0;
		int showType = 10;
		
		
		if (ticketType == 1) 
		{
		
			if (showType == 10) 
			{
				price = 9.50;
			} 
			else 
			{
				price = 8.00; 
			}
		}
		else if (ticketType == 2) 
		{
			
			if (showType == 10) 
			{
				price = 6.00;
			}
			
			else 
			{
				price = 5.00;
			}
		}
		else 
		{
			System.out.println("Unknown ticket type");
		}
		System.out.println(price);
	}

}
