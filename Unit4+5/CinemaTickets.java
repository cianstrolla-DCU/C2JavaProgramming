import java.util.Scanner;
/*
 * This program calculates the cost of admittance for different 
 * types of cinema-goer
 */
public class CinemaTickets
{
 public static void main(String[] args)
 {
   // there are three different price bands
   final double PRICE_BAND1 = 4.00;
   final double PRICE_BAND2 = 5.00;
   final double PRICE_BAND3 = 9.00;

   Scanner in = new Scanner(System.in);
   String type;
   int priceBand = 1;
   double totalPrice = 0;  // overall total price
   for (int i = 0; i < 3; i++)  // ask user 3 times
   {
     boolean valid = false;  // must have valid ticket type c,s,o or a
     do
     {
      System.out.print("Please select ticket type (c=child,s=student,o=oap,a=adult): ");
      type = in.next();
      if (!type.equals("c") && !type.equals("s") && !type.equals("o") && !type.equals("a"))
      {
        System.out.println("Invalid ticket type selected, try again");
      }
      else
      {
        valid = true;  // good ticket type
        if (type.equals("c")) // children and in band 1
        {
          priceBand = 1;
        }
        else if (type.equals("s") || type.equals("o")) // student & oap band 2
        {
          priceBand = 2;
        }
        else // others band 3
        {
          priceBand = 3;
        }
      }
     } while (!valid);
     System.out.print("Enter number of tickets: ");
     int numTickets = in.nextInt();
     double price = 0;
     switch(priceBand) // depending on priceband, calculate price
     {
      case 1: price = numTickets * PRICE_BAND1; break;
      case 2: price = numTickets * PRICE_BAND2; break;
      case 3: price = numTickets * PRICE_BAND3; break;
      default: price = 0; System.out.println("Invalid price band"); break;
     }
     System.out.printf("Price: %.2f\n", price);
     totalPrice += price; // add current price to total price
   }
   System.out.printf("Total Price: %.2f\n", totalPrice);
   in.close();
 }
}