/*
 * This builds on the original MobilePhone class by asking the instantiating program to provide a String when calling the displayMessage
 * method. The String provided is then printed back out to the screen.
 */

package mobilePhone2;

public class MobilePhone {
	
	public void displayMessage(String name) {
	
		System.out.println("Welcome " + name + "!");
	
	}
}
