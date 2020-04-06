package searching;

import java.util.Arrays;

public class binarySearch {

    // Time complexity: O(log n)
    // Expln: https://www.javatpoint.com/binary-search-in-java
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


    /**
     * Psuedo code:
     * PROGRAM: BinarySearch
     *  BinarySearch(array, value, lowerIndex, upperIndex){
     *      IF upperIndex >= lowerIndex
     *         mid = (lowerIndex + upperIndex) / 2
     *
     *         IF array[MID] == value
     *              return MID
     *         ELSE IF value > array[MID]
     *              BinarySearch(array, value, MID+1, upperIndex)
     *         ELSE
     *              BinarySearch(array, value, lowerIndex, MID-1)
     *         END IF
     *
     *     END IF
     *
     *     return -1 // Indicates value not found
     *  }
     *
     *
     *
     * @param lowerIndex
     * @param upperIndex
     * @param key
     * @param array
     * @return
     */
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
