/*
 * This class adds a private String owner, and a getter and setter method for that variable. Now each instance of this class has an owner
 * variable that we can refer to at any time.
 */

package mobilePhone3;

public class MobilePhone {
	
	private String owner = "No Owner";
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void displayMessage() {
	
		System.out.println("Welcome " + this.getOwner() + "!");
	
	}
}
