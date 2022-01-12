/*
 * This class represents the creation of individual students. The constructor requires a name, age, addressm, and height in order to 
 * create a new instance of this class. It also implements the required getters and setters for each variable. Lastly, it keeps track of
 * how many students have been created in total through the use of a static int variable numOfStudents.
 */

package students;

public class Student {
	
	private String name;
	private int age;
	private String address;
	private double height;
	
	private static int numOfStudents = 0;
	
	public Student(String name, int age, String address, double height) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		numOfStudents++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void displayDetails() {
		System.out.println("Printing Students Details:");
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Address: " + this.address);
		System.out.println("Height: " + this.height);
		System.out.println("Number Of Registered Students: " + numOfStudents);
		
	}
	
	
	
}
