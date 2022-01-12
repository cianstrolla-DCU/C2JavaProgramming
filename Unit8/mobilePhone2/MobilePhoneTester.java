/*
 * This class instantiates the MobilePhone.java class and tests its functionality.
 */

package mobilePhone2;

import java.util.Scanner;

public class MobilePhoneTester {

	public static void main(String[] args) {
		
		MobilePhone myPhone = new MobilePhone();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String nameOfOwner = in.nextLine();
		
		myPhone.displayMessage(nameOfOwner);
				
		in.close();
	}

}
