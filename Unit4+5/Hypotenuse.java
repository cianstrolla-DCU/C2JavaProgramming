/*
 * This program demonstrates a method called hypotenuseLength() which calculates a triangle's hypotenuse based on its other two sides. 
 */

public class Hypotenuse {

	public static void main(String[] args) {
		
		double firstResult = hypotenuseLength(6, 2);
		System.out.println("The hypotenuse for sides of length 6 and 2 is " + firstResult);
	
	}
	
	public static double hypotenuseLength(double side1Length, double side2Length) {
		
		double sumSides = (side1Length * side1Length) + (side2Length * side2Length);
		double result = Math.sqrt(sumSides);
		return result;
	
	}

}
