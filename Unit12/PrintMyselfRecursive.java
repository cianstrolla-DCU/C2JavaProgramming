// This program demonstrates a recursive call to the printMyself method.

public class PrintMyselfRecursive {

	public static void main(String[] args) {
		
		printMyself(3);
	
	}
	
	public static void printMyself(int i) {
		
		if (i == 0) {
			return;
		}
		
		System.out.println(i);
		
		i--;
		
		printMyself(i);
	}
}

/*
 * i = 3
 * 
 * 
 * printMyself(3)
 * 
 * is i == 0? No
 * 
 * print i => 3
 * 
 * i = 2
 * 
 * 				printMyself(2)
 * 
 * 				is i == 0? No
 * 
 * 				i = 1
 * 
 * 								printMyself(1)
 * 								is i == 0? No
 * 
 * 								i = 0
 * 
 * 												printMyself(0)
 * 
 * 												is i == 0? YES
 * 												return!
 * 
 * 
 * 
 */
