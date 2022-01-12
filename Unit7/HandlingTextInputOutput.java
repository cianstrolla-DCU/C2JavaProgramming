/*
 * This class reads input from input.txt and performs several checks to determine whether it is a digit, letter, etc.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingTextInputOutput {

	public static void main(String[] args) throws FileNotFoundException {
		
		File inputFile = new File("input.txt");
		Scanner in = new Scanner(inputFile);
		
		in.useDelimiter("");
		
		while (in.hasNext()) {
			
			char nextChar = in.next().charAt(0);
			checkChar(nextChar);
		}
		
		in.close();
	}
	
	public static void checkChar(char nextChar) {
		
		System.out.println("-----------------");
		System.out.println(nextChar);
				
		System.out.println("Digit: " + Character.isDigit(nextChar)); // check if it is numeric (0..9) 
		System.out.println("Letter: " + Character.isLetter(nextChar)); // check if it is a letter of the alphabet (A..Z or a..z) 
		
		System.out.println("Uppercase: " + Character.isUpperCase(nextChar));
		System.out.println("Lowercase: " + Character.isLowerCase(nextChar));
		
		System.out.println("Whitespace: " + Character.isWhitespace(nextChar));
	}

}
