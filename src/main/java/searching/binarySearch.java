package searching;

import java.util.Arrays;

public class binarySearch {

    // Time complexity: O(log n)
    // Analysis: https://hackernoon.com/what-does-the-time-complexity-o-log-n-actually-mean-45f94bb5bfbf

    public static void main(String[] args){
        int[] array = {41,31,59,26,41,58};
        int key = 23    ;
        int lowerIndex = 0;
        int upperIndex = array.length-1;

        // Since focus is on search, using inbuilt function to sort
        Arrays.sort(array);

        System.out.println("Element Present: " + binarySearchRecursion(lowerIndex, upperIndex, key, array));

    }

    static boolean binarySearchRecursion(int lowerIndex, int upperIndex, int key, int[] array){
        int mid = (lowerIndex + upperIndex) / 2;

        if(upperIndex >= lowerIndex){
            if(key == array[mid])
                return true;

            if(key < array[mid])
                return binarySearchRecursion(lowerIndex, mid-1, key, array);

            if(key > array[mid])
                return binarySearchRecursion(mid+1, upperIndex, key, array);
        }

        return false;
    }
}
