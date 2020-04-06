package sorting;

// Reference: https://algorithms.tutorialhorizon.com/heap-sort-java-implementation/
// Time complexity: O(N * log N)

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
