package vehicles;

// Note for tutorial: Create new file and demonstrate Eclipse suggesting super constructor.

public class Car extends Vehicle {
	
	private String nickname;
	private int noOfSeats = 5;
	private int noOfWheels = 4;
	private boolean hasDoors = true;
	private boolean hasWindows = true;

	public Car(String make, String model, String colour, int engine, String nickname) {
		
		super(make, model, colour, engine);
		
		this.setNickname(nickname);
		
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	// Note for tutorial: Green arrow in sidebar showing override
	public void displayDetails() {
		System.out.println("Displaying the details of: " + getNickname());
		System.out.println("");
		super.displayDetails();
		System.out.println("");
		System.out.println("Number of seats: " + this.noOfSeats);
		System.out.println("Number of wheels: " + this.noOfWheels);
		System.out.println("Has doors: " + this.hasDoors);
		System.out.println("Has windows: " + this.hasWindows);
		System.out.println(testing);
		
	}
	
}
