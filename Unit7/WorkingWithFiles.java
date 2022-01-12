/*
 * This class demonstrates how to work with Files through the Java File class. It has two methods. The first method shows how to 
 * use the PrintWriter class to write to a file. The second method shows how to use the Scanner class combined with the File class 
 * to read information in from a file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFiles {

	public static void main(String[] args) throws FileNotFoundException{
		
		writeToFile("output.txt");
		
		File inputFile = new File("output.txt");
		
		readFromFile(inputFile);
	}
	
	public static void writeToFile(String fileName) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter(fileName);
		out.println("hello World");
		out.println("goodbye world");
		out.println("my name is cian strolla");
		out.println("this is a test");
	
		out.close();
		
	}
	
	public static void readFromFile(File inputFile) throws FileNotFoundException {
		

		System.out.println("Reading from: " + inputFile.getName());
		System.out.println("Content: ");
		System.out.println("");
		
		Scanner in = new Scanner(inputFile);
		while (in.hasNext()) {
			System.out.println(in.nextLine());
		}
		in.close();
		
	}

}
