package sortingAlgorithmsComparison;

public class TestSortingAlgorithms {

    public static void main(String[] args) {
        int A[]=new int[100000];

       SortingAlgorithms sort=new SortingAlgorithms();
       shuffleArray(A);
        sort.BubbleSort(A);

        if (isSorted(A)){
            System.out.println("Bubble Sort - TRUE");

        }
        else{
            System.out.println("Bubble Sort - FALSE");
        }
        shuffleArray(A);
        sort.SelectionSort(A);
        if (isSorted(A)){
            System.out.println("Selection Sort - TRUE");
        }
        else{
            System.out.println("Selection Sort - FALSE");
        }
        shuffleArray(A);
        sort.InsertionSort(A);
        if (isSorted(A)){
            System.out.println("Insertion Sort - TRUE");
        }
        else{
            System.out.println("Insertion Sort - FALSE");
        }
        shuffleArray(A);
        sort.MergeSort(A);
        if (isSorted(A)){
            System.out.println("Merge Sort - TRUE");
        }
        else{
            System.out.println("Merge Sort - FALSE");
        }
        shuffleArray(A);
        sort.QuickSort(A);
        if (isSorted(A)){
            System.out.println("Quick Sort - TRUE");
        }
        else{
            System.out.println("Quick Sort - FALSE");
        }
        shuffleArray(A);
        sort.HeapSort(A);
        if (isSorted(A)){
            System.out.println("Heap Sort - TRUE");
        }
        else{
            System.out.println("Heap Sort - FALSE");
        }
        shuffleArray(A);
        sort.CountingSort(A);

        if (isSorted(A)){
            System.out.println("Counting Sort - TRUE");
        }
        else{
            System.out.println("Counting Sort - FALSE");
        }
        shuffleArray(A);
        sort.RadixSort(A);
        if (isSorted(A)){
            System.out.println("Radix Sort - TRUE");
        }
        else{
            System.out.println("Radix Sort - FALSE");
        }
        System.out.println();
        sort.summaryofSortingAlgorithms();
        System.out.println();
    }

    public static void shuffleArray(int [] a){
        for(int i=0;i<a.length;i++)
            a[i]=(int)(Math.random()*10000);
    }

    public static boolean isSorted(int a[]){
        boolean sorted=true;
        for(int i=0;i<a.length-1;i++)
            if(a[i]>a[i+1])
                sorted=false;
        return sorted;
    }
}
