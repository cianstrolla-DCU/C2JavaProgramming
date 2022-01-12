package comparisionInterface;

public class Testing {

	public static void main(String[] args) {
		
		Shape myRectangle = new Rectangle(2, 3);
		System.out.println("Area of Rectangle: " + myRectangle.area());
		
		Shape myCircle = new Circle(2);
		System.out.println("Area of circle: " + myCircle.area());

	}

}
