// A recursive java implementation of a Binary Search Algorithm
package searchingAlgorithms;

public class BinarySearchRecursive {
	int binarySearch(int arr[], int l, int r, int x) {
		
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[mid] == x)
                return mid;
  
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            return binarySearch(arr, mid + 1, r, x);
        }
  
        return -1;
    }
  
    public static void main(String args[]) {
        BinarySearchRecursive ob = new BinarySearchRecursive();
        int arr[] = {2,3,5,6,12,15,17,19,20,25,27,29,30,35,37,42,47,50,94,105};
        
        int n = arr.length;
        int x = 94;
        int result = ob.binarySearch(arr, 0, n - 1, x);
      
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}
