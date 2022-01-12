package vehicles;

public class Vehicle {

	private String make;
	private String model;
	private String colour;
	private int engine;
	protected String testing = "hello";
	
	public Vehicle(String make, String model, String colour, int engine) {
		this.setMake(make);
		this.setModel(model);
		this.setColour(colour);
		this.setEngine(engine);	

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public void displayDetails() {
		System.out.println("Make: " + getMake());
		System.out.println("Model: " + getModel());
		System.out.println("Colour: " + getColour());
		System.out.println("Engine: " + getEngine());
		
	}
}
