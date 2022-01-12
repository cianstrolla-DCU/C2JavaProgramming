package employees;

public class Testing {

	public static void main(String[] args) {
		
		Programmer Cian = new Programmer("Cian", 30, 250000, "Computer Science", "Java");
		System.out.println(Cian.toString());
		
		
		Accountant Angelo = new Accountant("Angelo", 30, 500000, "The Numbers", "Numbers + Me");
		System.out.println(Angelo.toString());
		
	}
	
}
