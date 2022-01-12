/*
 * This class shows how to quickly write a large amount of outputs to a file. Here, we random generate an age between 0 and 100 and 
 * print it to the output.txt file.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateAgesOutputFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("output.txt");
		
		for (int x = 0; x < 1000; x++) {
			Random r = new Random();
			out.print(r.nextInt(100) + " ");
		}
		out.close();
		

	}

}
