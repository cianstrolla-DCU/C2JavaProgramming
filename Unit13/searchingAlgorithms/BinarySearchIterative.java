// An iterative java implementation of a Binary Search Algorithm

package searchingAlgorithms;

public class BinarySearchIterative {
	int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            if (arr[m] == x)
                return m;
  
            if (arr[m] < x)
                l = m + 1;
  
            else
                r = m - 1;
        }
  
        return -1;
    }
  
    public static void main(String args[])
    {
        BinarySearchIterative ob = new BinarySearchIterative();
      
        int arr[] = {2,3,5,6,12,15,17,19,20,25,27,29,30,35,37,42,47,50,94,105};
        int n = arr.length;
        int x = 94;
      
        int result = ob.binarySearch(arr, x);
      
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                               + "index " + result);
    }
}
