// This program takes in an input from the user and recursively checks whether or not it is a palindrome.
import java.util.Scanner;

public class PalindromeRecursive {
	
	
	public static boolean isPal(String s) 
	{   
        if(s.length() == 0 || s.length() == 1) {
            return true; 
        }
        
        if(s.charAt(0) == s.charAt(s.length()-1)) {

            return isPal(s.substring(1, s.length()-1));
        }

        return false;
    }
	
	/*
	 * racecar
	 * 
	 * is r == r -> yes
	 * 
	 * aceca
	 * 
	 * is a == a -> yes
	 * 
	 * cec
	 * 
	 * is c == c -> yes
	 * 
	 * e
	 */
	
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the String to check:");
        String string = scanner.nextLine();

        if(isPal(string)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
    
        }
        
        scanner.close();
    }
}
