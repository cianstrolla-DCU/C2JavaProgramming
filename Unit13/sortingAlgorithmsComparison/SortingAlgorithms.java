package sortingAlgorithmsComparison;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class SortingAlgorithms {
    private int[] array;
    private int length;
    long[] durations = new long[8];

    public SortingAlgorithms() {
    }

    public void BubbleSort(int[] A) {
        long startTime = System.nanoTime();
        int n = A.length;

        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - i - 1; ++j) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        long endTime = System.nanoTime();
        this.durations[0] = (endTime - startTime) / 1000000L;
    }

    public void SelectionSort(int[] A) {
        long startTime = System.nanoTime();
        int n = A.length;

        for(int i = 0; i < n - 1; ++i) {
            int minIdx = i;

            int j;
            for(j = i + 1; j < n; ++j) {
                if (A[j] < A[minIdx]) {
                    minIdx = j;
                }
            }

            j = A[minIdx];
            A[minIdx] = A[i];
            A[i] = j;
        }

        long endTime = System.nanoTime();
        this.durations[1] = (endTime - startTime) / 1000000L;
    }

    public void InsertionSort(int[] A) {
        long startTime = System.nanoTime();
        int n = A.length;

        for(int i = 1; i < n; ++i) {
            int key = A[i];

            int j;
            for(j = i - 1; j >= 0 && A[j] > key; --j) {
                A[j + 1] = A[j];
            }

            A[j + 1] = key;
        }

        long endTime = System.nanoTime();
        this.durations[2] = (endTime - startTime) / 1000000L;
    }

    public void MergeSort(int[] A) {
        long startTime = System.nanoTime();
        this.MergeSortAlgorithm(A);
        long endTime = System.nanoTime();
        this.durations[3] = (endTime - startTime) / 1000000L;
    }

    public int[] MergeSortAlgorithm(int[] A) {
        if (A.length <= 1) {
            return A;
        } else {
            int m = A.length / 2;
            int[] left = Arrays.copyOfRange(A, 0, m);
            int[] right = Arrays.copyOfRange(A, m, A.length);
            this.MergeSortAlgorithm(left);
            this.MergeSortAlgorithm(right);
            this.Merge(A, left, right);
            return A;
        }
    }

    public void Merge(int[] A, int[] left, int[] right) {
        int j = 0;
        int k = 0;
        int l = 0;

        while(j < left.length && k < right.length) {
            if (left[j] < right[k]) {
                A[l] = left[j];
                ++l;
                ++j;
            } else {
                A[l] = right[k];
                ++l;
                ++k;
            }
        }

        while(j < left.length) {
            A[l] = left[j];
            ++l;
            ++j;
        }

        while(k < right.length) {
            A[l] = right[k];
            ++l;
            ++k;
        }

    }

    public void QuickSort(int[] A) {
        long startTime = System.nanoTime();
        if (A != null && A.length != 0) {
            this.array = A;
            this.length = A.length;
            this.quickSort(0, this.length - 1);
            long endTime = System.nanoTime();
            this.durations[4] = (endTime - startTime) / 1000000L;
        }
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = this.array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while(i <= j) {
            while(this.array[i] < pivot) {
                ++i;
            }

            while(this.array[j] > pivot) {
                --j;
            }

            if (i <= j) {
                this.exchangeNumbers(i, j);
                ++i;
                --j;
            }
        }

        if (lowerIndex < j) {
            this.quickSort(lowerIndex, j);
        }

        if (i < higherIndex) {
            this.quickSort(i, higherIndex);
        }

    }

    private void exchangeNumbers(int i, int j) {
        int temp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = temp;
    }

    public void HeapSort(int[] A) {
        long startTime = System.nanoTime();
        this.Heap(A, A.length);
        long endTime = System.nanoTime();
        this.durations[5] = (endTime - startTime) / 1000000L;
    }

    void Heap(int[] A, int n) {
        int i;
        for(i = n / 2 - 1; i >= 0; --i) {
            this.heapify(A, n, i);
        }

        for(i = n - 1; i >= 0; --i) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            this.heapify(A, i, 0);
        }

    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[i]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            this.heapify(arr, n, largest);
        }

    }

    public void CountingSort(int[] A) {
        long startTime = System.nanoTime();
        int N = A.length;
        if (N != 0) {
            int max = A[0];
            int min = A[0];

            int range;
            for(range = 1; range < N; ++range) {
                if (A[range] > max) {
                    max = A[range];
                }

                if (A[range] < min) {
                    min = A[range];
                }
            }

            range = max - min + 1;
            int[] count = new int[range];

            int j;
            for(j = 0; j < N; ++j) {
                ++count[A[j] - min];
            }

            for(j = 1; j < range; ++j) {
                count[j] += count[j - 1];
            }

            j = 0;

            for(int i = 0; i < range; ++i) {
                while(j < count[i]) {
                    A[j++] = i + min;
                }
            }

            long endTime = System.nanoTime();
            this.durations[6] = (endTime - startTime) / 1000000L;
        }
    }

    public void RadixSort(int[] A) {
        long startTime = System.nanoTime();
        List<Integer>[] bucket = new ArrayList[10];

        for(int i = 0; i < bucket.length; ++i) {
            bucket[i] = new ArrayList();
        }

        boolean maxLength = false;


        for(int placement = 1; !maxLength; placement *= 10) {
            maxLength = true;
            int[] var9 = A;
            int b = A.length;

            Integer i;
            for(int var11 = 0; var11 < b; ++var11) {
                i = var9[var11];
                int tmp = i / placement;
                bucket[tmp % 10].add(i);
                if (maxLength && tmp > 0) {
                    maxLength = false;
                }
            }

            int a = 0;

            for(b = 0; b < 10; ++b) {
                for(Iterator var17 = bucket[b].iterator(); var17.hasNext(); A[a++] = i) {
                    i = (Integer)var17.next();
                }

                bucket[b].clear();
            }
        }

        long endTime = System.nanoTime();
        this.durations[7] = (endTime - startTime) / 1000000L;
    }

    public void summaryofSortingAlgorithms() {
        System.out.println("--- Summary of Sorting Algorithms ---");
        System.out.println("Bubble Sort took -> " + this.durations[0]);
        System.out.println("Selection Sort took -> " + this.durations[1]);
        System.out.println("Insertion Sort took -> " + this.durations[2]);
        System.out.println("Merge Sort took -> " + this.durations[3]);
        System.out.println("Quick Sort took -> " + this.durations[4]);
        System.out.println("Heap Sort took -> " + this.durations[5]);
        System.out.println("Counting Sort took -> " + this.durations[6]);
        System.out.println("Radix Sort took -> " + this.durations[7]);
        System.out.println(" ");
    }
}
