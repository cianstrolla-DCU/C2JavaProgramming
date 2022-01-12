/*
 * This class demonstrates how to read in Filenames (or any data) through Command Line Arguments. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilenamesFromCommandline {

	public static void main(String[] args) throws FileNotFoundException {
		String inputFileName = "input.txt";
		String outputFileName = "outputrunner.txt";
	        
		for (int i=0; i<args.length; i++) {
			
			String nextArg = args[i];
			
			if (nextArg.equals("-i")) {
				inputFileName = args[i+1];
				i++;
			} else if  (nextArg.equals("-o")) {
				outputFileName = args[i+1];
				i++;
			}
	   }
	        
	   // Create objects to read and write files
	   File inputFile = new File(inputFileName);
	   Scanner in = new Scanner(inputFile);
	   PrintWriter out = new PrintWriter(outputFileName);
	        
	   // Read the input and keep track of total for average
	   int numInputs = 0;
	   int total = 0;
	        
	   while(in.hasNextInt())
	   {
			// read next age from input file
			int nextAge = in.nextInt();
			// write this age to output file on its own line
			out.println(nextAge);
			// keep track of total
			total += nextAge;
			// keep track of number of items read
			numInputs++;
	   }
	   // calculate average
	   int average = numInputs > 0 ? total / numInputs : 0;
	   // write average to last line
	   out.println("Average: " + average);
	        
	   // close both files
	   in.close();
	   out.close();
	}

}
