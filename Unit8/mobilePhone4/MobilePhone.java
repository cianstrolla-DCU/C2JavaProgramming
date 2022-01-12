/*
 * This class adds a constructor to the MobilePhone class. Now, instead of asking the test program having to call the setOwner method, 
 * the name of the owner should be given when instantiating the class.
 */

package mobilePhone4;

public class MobilePhone {
	
	private String owner;
	
	public MobilePhone(String owner) {
		this.setOwner(owner);
	}
	
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
