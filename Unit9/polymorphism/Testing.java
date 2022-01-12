package polymorphism;

public class Testing {

	public static void main(String[] args) {
		
		Shape myShape = new Shape();
		Shape myTriangle = new Triangle();
		Shape myCircle = new Circle();
		
		myShape.area();
		myShape.area(5);
		myShape.area("Hello");
		
		myTriangle.area();
		myShape.area();
		myCircle.area();

	}

}
