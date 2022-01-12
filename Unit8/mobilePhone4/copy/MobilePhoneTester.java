package mobilePhone4.copy;

import java.util.Scanner;

public class MobilePhoneTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name1 = in.next();
		System.out.print("Please enter your security code: ");
		String pass1 = in.next();
		
		System.out.print("Please enter your name: ");
		String name2 = in.next();
		System.out.print("Please enter your security code: ");
		String pass2 = in.next();
		
		MobilePhone phone1 = new MobilePhone(name1, pass1);
		MobilePhone phone2 = new MobilePhone(name2, pass2);
		
		phone1.displayMessage();
		phone2.displayMessage();
		
		in.close();
	} 

}
