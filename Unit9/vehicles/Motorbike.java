package vehicles;

public class Motorbike extends Vehicle {

	private int noOfWheels = 2;
	private boolean canWheelie = true;
	private boolean needsHelmet = true;

	public Motorbike(String brand, String model, String colour, int engine) {
		
		super(brand, model, colour, engine);
		
	}
	
	// Note for tutorial: Green arrow in sidebar showing override
	public void displayDetails() {
		System.out.println("Displaying Details:");
		System.out.println("");
		super.displayDetails();
		System.out.println("");
		System.out.println("Number of wheels: " + this.noOfWheels);
		System.out.println("Can Wheelie: " + this.canWheelie);
		System.out.println("Needs Helmet: " + this.needsHelmet);
		
	}

}
