// example of array and manipulating array

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] myNumbers = new int[5];
		
		System.out.println(Arrays.toString(myNumbers));
		
		for (int x = 0; x < myNumbers.length; x++) {
			myNumbers[x] = x * x * x;
		}
		
		System.out.println(Arrays.toString(myNumbers));

	}

}
