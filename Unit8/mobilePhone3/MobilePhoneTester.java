/*
 * This class instantiates the MobilePhone.java class and tests its functionality.
 */

package mobilePhone3;

import java.util.Scanner;

public class MobilePhoneTester {

	public static void main(String[] args) {
		
		MobilePhone myPhone = new MobilePhone();
		
		myPhone.displayMessage();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String nameOfOwner = in.nextLine();
		
		myPhone.setOwner(nameOfOwner);
		
		myPhone.displayMessage();
		
		in.close();
	}

}
