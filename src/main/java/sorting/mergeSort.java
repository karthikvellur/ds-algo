package sorting;

// Reference: https://www.geeksforgeeks.org/merge-sort/

public class mergeSort {

    public static void main(String[] args){
        int arr[] = {10,76,123,98,78};
        sort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    static void sort(int arr[], int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int arr[], int low, int mid, int high){
        // Create two sub arrays with the length of indexes
        int leftArrLen = mid - low + 1;
        int rightArrLen = high - mid;

        int leftArr[] = new int[leftArrLen];
        int righArr[] = new int[rightArrLen];

        for(int i=0; i<leftArrLen; i++)
            leftArr[i] = arr[low+i];

        for(int j=0; j<rightArrLen; j++)
            righArr[j] = arr[mid+1+j];

        // Merge the arrays with comparison
        int i = 0, j = 0; // Initial index of left & right sub arrays for traversing
        int k = 0;
        while (i < leftArrLen && j < rightArrLen){
            if(leftArr[i] < righArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = righArr[j++];
        }

        // Copy remaining elements of left array
        while (i<leftArrLen){
            arr[k++] = leftArr[i++];
        }

        // Copy remaining elements of right array
        while (j<rightArrLen){
            arr[k++] = righArr[j++];
        }
    }
}
