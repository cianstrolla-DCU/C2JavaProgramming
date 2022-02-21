// A java implementation of a Linear Search Algorithm. This code loops through an array and checks each element to see if it matches the element that is being searched for.
package searchingAlgorithms;

public class LinearSearch {
	
	 public static int search(int arr[], int x)
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	        {
	            if (arr[i] == x)
	                return i;
	        }
	        return -1;
	    }
	 
	    public static void main(String args[])
	    {
	        int arr[] = {10,24,18,6,37,56,48,75,96,51,23,15,6,7,8,2};
	        int x = 96;
	        
	        int result = search(arr, x);
	        if (result == -1)
	            System.out.print(
	                "Element is not present in array");
	        else
	            System.out.print("Element is present at index " + result);
	    }
}
