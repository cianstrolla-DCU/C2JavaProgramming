package polymorphism;

public class Shape {
	
	public void area() {
		System.out.println("Area of Shape");
	}
	
	public void area(int i) {
		System.out.println("Area + 1 int");
	}
	
	public void area(String myString) {
		System.out.println("area + string");
	}
	
}
