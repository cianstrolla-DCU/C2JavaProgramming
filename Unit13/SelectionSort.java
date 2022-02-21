// A java implementation a Selection Sort algorithm
package sortingAlgorithms;

class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++)
		{
			int min = i;
			
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min])
					min = j;

			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		SelectionSort ob = new SelectionSort();
		int arr[] = {10,24,18,6,37,56,48,75,96,51,23,15,6,7,8,2};
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
	}
}
