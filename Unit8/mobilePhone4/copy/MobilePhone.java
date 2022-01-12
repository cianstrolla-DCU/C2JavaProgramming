package mobilePhone4.copy;

public class MobilePhone {
	
	private String owner;
	private String securityCode;
	
	public MobilePhone(String owner, String securityCode) {
		this.setOwner(owner);		
		this.setSecurityCode(securityCode);
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public void displayMessage() {
	
		System.out.println("Welcome " + this.getOwner() + "!");
		System.out.println("Your security code is " + this.getSecurityCode());
	
	}
}
