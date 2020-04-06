package sorting;

/**
 * Explanation: https://www.geeksforgeeks.org/heap-sort/
 * 1) Max heap explanation: https://www.geeksforgeeks.org/max-heap-in-java/
 *  -- Binary tree where in child nodes are less than parent node
 * 2) Min heap - vice versa of Max heap
 * Implementation: https://algorithms.tutorialhorizon.com/heap-sort-java-implementation/
 *
 * Time complexity: O(N * log N)
 */

/**
 * Psuedo-code
 *  PROGRAM: Heap Sort
 *
 *   Step 1: heapify(array, heapSize, index)
 *     - Ensure max heap is followed at the index for the heapsize specified
 *
 *   Step 2: sort(array)
 *     FOR i = array size to 0
 *        Swap i with first element in array
 *        Reduce heapsize by 1 and heapify array
 *     ENDFOR
 *
 *  END
 *
 */
public class heapSort {

    public static void main(String[] args){
        int[] arr = {9, 10, 5, 3, 1, 2, 6};
        sort(arr);
        for(int i: arr){
            System.out.println(i);
        }

    }

    static void sort(int[] arr){
        int size = arr.length;

        for(int i= size / 2 -1; i>=0; i--){
            heapify(arr, size, i);
        }

        for(int i=size-1; i>=0; i--){  // n
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0); // log n
        }

    }

    static void heapify(int[] arr, int heapSize, int idx){
        int largest = idx;
        int leftIdx = idx * 2 + 1;
        int rightIdx = idx * 2 + 2;

        if(leftIdx < heapSize && arr[leftIdx] > arr[largest]){
            largest = leftIdx;
        }

        if(rightIdx < heapSize && arr[rightIdx] > arr[largest]){
            largest = rightIdx;
        }

        if(largest != idx){
            int temp = arr[largest];
            arr[largest] = arr[idx];
            arr[idx] = temp;
        }
    }
}
