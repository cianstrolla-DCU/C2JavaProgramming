package vehicles;

public class Testing {

	public static void main(String[] args) {
		
		Car car1 = new Car("Mercedes", "C250", "Grey", 2500, "Betsy");
		
		
		Motorbike bike1 = new Motorbike("Kawasaki", "Ninja H2R", "Black", 998);
		bike1.displayDetails();
		
		System.out.println("");
		
		Vehicle vehicle1 = car1;
		vehicle1.displayDetails();
	}

}
