/*
 * This class demonstrates a number of methods that accepts input from the user, creates an array of those inputs and then 
 * performs calculation of sum, average, max and min on the elements. Finally, it prints these results to the screen.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {

		double[] nums = readInputs();
	     
	    System.out.println("Your array is " + Arrays.toString(nums));
	    double sum = sumOf(nums);
	    double average = 0;
	    if (nums.length > 0)
	    {
	      average = sum / nums.length;
	    }
	    System.out.println("The sum of your elements is " + sum);
	    System.out.println("The average of your elements is " + average);
	    System.out.println("The maximum element is " + maxElement(nums));
	    System.out.println("The minimum element is " + minElement(nums));

	    swapElements(nums, 0, nums.length - 1);
	    System.out.println("After swapping first and last elements, your array is " + Arrays.toString(nums));
	  }

	  /*
	  * Ask the user to enter the size of their array between 2-10
	  * Read that number of elements into the array
	  * @return the array
	  */
	  public static double[] readInputs()
	  {
	    Scanner in = new Scanner(System.in);
	    final int MIN_INPUTS = 2;
	    final int MAX_INPUTS = 10;
	    int numberOfElements;
	    boolean goodAnswer = false;
	    do
	    {
	      System.out.print("How many numbers will you enter (min " + MIN_INPUTS + ", max "+ MAX_INPUTS +")?: ");
	      numberOfElements = in.nextInt();
	      if (numberOfElements >= MIN_INPUTS && numberOfElements <= MAX_INPUTS)
	      {
	        goodAnswer = true;
	      }
	      else
	      {
	        System.out.println(numberOfElements + " is out of range, must be between " + MIN_INPUTS + " and " + MAX_INPUTS);
	      }
	    } while (!goodAnswer);
	        
	    // create the array
	    double[] nums = new double[numberOfElements];
	    int currentSize = 0;
	 
	    // read the inputs
	    System.out.println("Enter "+ nums.length + " numbers or any letter to quit: ");
	        
	    // note the order of evaluation in the while loop
	    // we check the length first, because if we don't
	    // in.hasNextDouble will wait until the user enters something
	    while (currentSize < nums.length && in.hasNextDouble())
	    {
	      nums[currentSize] = in.nextDouble();
	      currentSize++;
	    }
	        
	    // resize the array in case the user quit before filling
	    // in all their values and ensure it is of length of at least MIN_INPUTS
	    double[] result = Arrays.copyOf(nums, Math.max(currentSize, MIN_INPUTS));
	    in.close();
	    return result;
	  }

	  /*
	  * Find the maximum value in an array
	  * @param values the array
	  * @return double the maximum value
	  */
	  public static double maxElement(double[] values)
	  {
	    double max = 0;
	    if (values.length > 0)
	    {
	      max = values[0];
	      for (int i = 1; i < values.length; i++)
	      {
	        if (values[i] > max)
	        {
	          max = values[i];
	        }
	      }
	    }
	    return max;
	  }

	  /*
	  * Find the minimum value in an array
	  * @param values the array
	  * @return double the minimum value
	  */
	  public static double minElement(double[] values)
	  {
	    double min = 0;
	    if (values.length > 0)
	    {
	      min = values[0];
	      for (int i = 1; i < values.length; i++)
	      {
	        if (values[i] < min)
	        {
	          min = values[i];
	        }
	      }
	    }
	    return min;
	  }

	  /*
	  * Calculate the sum of elements in an array
	  * @param values the array
	  * @return double the sum of the elements
	  */
	  public static double sumOf(double[] values)
	  {
	    double sum = 0;
	    if (values.length > 0)
	    {
	      for (int i = 0; i < values.length; i++)
	      {
	        sum += values[i];
	      }
	    }
	    return sum;
	  }

	  /*
	  * Swaps two elements in an array
	  * Note this method changes the array
	  * @param values the array
	  * @param i the index of the first element to swap with the second
	  * @param j the index of the second element to swap with the first
	  */
	  public static void swapElements(double[] values, int i, int j)
	  {
	    if (i < 0 || i >= values.length)
	    {
	      System.out.println("index " + i + " is out of range");
	    }
	    else if (j < 0 || j >= values.length)
	    {
	      System.out.println("index " + j + " is out of range");
	    }
	    else
	    {
	      double temp = values[i];
	      values[i] = values[j];
	      values[j] = temp;
	    }

	}

}
