/*
 * This class instantiates the MobilePhone.java class and tests its functionality.
 */

package mobilePhone4;

import java.util.Scanner;

public class MobilePhoneTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String name1 = in.next();
		String name2 = in.next();
		
		MobilePhone phone1 = new MobilePhone(name1);
		MobilePhone phone2 = new MobilePhone(name2);
		
		System.out.println("Phone 1 belongs to " + phone1.getOwner());
		System.out.println("Phone 2 belongs to " + phone2.getOwner());
		
		in.close();
	}

}
