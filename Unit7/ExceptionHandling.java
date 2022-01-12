import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * This program gets the input file name and
 * output file name from command-line arguments
 * -i <input filename> and -o <output filename>,
 * reads the input file of ages and produces
 * an output file that puts each age on a separate line
 * and ends with an average (which should be calculated)
 * as follows (if input file contains 20 22 21 23 19):
 *
 * 20
 * 22
 * 21
 * 23
 * 19
 * Average: 21
 */
public class ExceptionHandling
{
 public static void main(String[] args) throws FileNotFoundException
 {
   // initialise file names, so arguments are optional
   String inputFileName = "input.txt";
   String outputFileName = "output.txt";
        
   for (int i=0; i<args.length; i++)
   {
     String nextArg = args[i];
     if (nextArg.equals("-i"))
     {
       inputFileName = args[i+1];
       i++;
     }
     else if (nextArg.equals("-o"))
     {
       outputFileName = args[i+1];
       i++;
     }
   }
        
   ArrayList<Integer> ages = null;
   // try to read ages from file
   try
   {
     ages = readFile(inputFileName);
   }
   catch (FileNotFoundException exception)
   {
     // handle case where file does not exist
     System.out.println("The given file does not exist: " + inputFileName);
   }
   catch (NoSuchElementException exception)
   {
     // handle exception reading nextInt from file
     System.out.println("File contents are invalid");
   }
   catch (IOException exception)
   {
     // handle any other data exceptions
     exception.printStackTrace();
   }
        
   if (ages != null && ages.size() > 1)
   {
     // try to write results to output file
     try
     {
       writeFile(outputFileName, ages);
     }
     catch (FileNotFoundException exception)
     {
       // handle exception creating output file
       System.out.println("Problem writing to file " + outputFileName);
     }
     catch (IOException exception)
     {
       // handle any other data exceptions writing to file
       exception.printStackTrace();
     }
   }
 }
    
 /*
  * Opens a file and reads all integers from it
  * @param inputFileName the name of the file to open
  * @return an ArrayList of data in the file
  */
 public static ArrayList<Integer> readFile(String inputFileName) throws IOException
 {
   File inputFile = new File(inputFileName);
   Scanner in = new Scanner(inputFile);
   try
   {
     return readAges(in);
   }
   finally 
   {
     in.close();
     in = null;
   }        
 }
    
 /*
  * Reads all integers from an input source
  * @param in the Scanner connected to the input source
  * @return an ArrayList of integer data found
  */
 public static ArrayList<Integer> readAges(Scanner in) throws IOException
 {
   ArrayList<Integer>ages = new ArrayList<Integer>();
   while(in.hasNextInt())
   {
     // read next age from input file
     ages.add(in.nextInt()); // may throw NoSuchElementException
   }
        
   // there should be no more data after reading all the integers
   if (in.hasNext())
   {
     throw new IOException("Expected only integers but some other data found, contents are invalid");        
   }
   else if (ages.size() == 0)
   {
     // there must be some data in the file
     throw new IOException("No data found in input file");
   }
        
   return ages;
 }
    
 /*
  * Open a file for writing and write all data 
  * from an ArrayList of integers, adding an average at the end
  * @param outputFileName the name of the file to open and write to
  * @param ages the ArrayList of integers
  */
 public static void writeFile(String outputFileName, ArrayList<Integer> ages) throws IOException
 {
   PrintWriter out = new PrintWriter(outputFileName);
   try
   {
     writeAgesAndAverage(out, ages);
   }
   finally
   {
     out.close();
     out = null;
   }
 }
    
 /*
 * Write all data from an ArrayList to an output stream
 * @param out the PrintWriter to write to
 * @param ages the ArrayList of integers
 */
 public static void writeAgesAndAverage(PrintWriter out, ArrayList<Integer> ages) throws IOException
 {
   // must be some data
   if (ages.size() == 0)
   {
     throw new IOException("Invalid data supplied to write to output file");
   }
        
   // for each element, add to total and write to output stream
   int total = 0;
   for (int i = 0; i < ages.size(); i++)
   {
     total += ages.get(i);
     out.println(ages.get(i));
   }
   // now calculate and write the average to the output stream
   int average = total/ages.size();
   out.println("Average: "+average);
 }    
} 