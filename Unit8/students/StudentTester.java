package students;

import java.util.Scanner;

public class StudentTester {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		System.out.println("Welcome to the new student creator program.");
		System.out.println("To create a new student, we require some details.");
		
		Student student1 = createStudent();
		
		student1.displayDetails();
		
		in.close();
	}

	private static Student createStudent() {
		
		System.out.print("Please enter the name of the student: ");
		String name = in.nextLine();
		
		System.out.print("Please enter the age of the student: ");
		int age = in.nextInt();
		in.nextLine();
		
		System.out.print("Please enter the address of the student: ");
		String address = in.nextLine();
		
		System.out.print("Please enter the height of the student: ");
		double height = in.nextDouble();
		in.nextLine();
		
		Student newStudent = new Student(name, age, address, height);

		return newStudent;
		
		
		
		
	}

}
