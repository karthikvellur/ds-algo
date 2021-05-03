package ds;

import java.util.HashSet;

public class array {

    public static void main(String[] args){

        verifyTwoNumberSumExists(new int[]{2,4,5,1}, 9);

        // reverseArray();

        // Reference: https://www.geeksforgeeks.org/equilibrium-index-of-an-array/
//        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
//        System.out.println("Equilibrium of array using index of each array element: " + findEquilibriumOfArr_forEachIndex(arr)); ;
//        System.out.println("Equilibrium of array sum(right sum) & leftSum: " + findEquilibrium_efficientWay(arr)); ;

    }

    // Reversing an array
    // Time complexity: O(N) - Even though loop goes through only half the array it does not impact the O complexity
    static void reverseArray(){
        int arr[] = {2, 4, 7, 90, 10};

        int newIndex;
        int temp;
        for(int i=0; i<(arr.length / 2); i++){ // Here only half the array has to be traversed since by mid of array, array is actually is reversed. If it is done for full length, then elements will come back to its original place
            newIndex = arr.length - 1 - i;
            temp = arr[i];
            arr[i] = arr[newIndex];
            arr[newIndex] = temp;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // Time complexity: O(N*N)
    static int findEquilibriumOfArr_forEachIndex(int[] arr){

        int i,j;
        int leftSum, rightSum;
        for(i=0; i<arr.length; i++){
            leftSum = 0;
            for(j=0; j<i; j++){
                leftSum =  leftSum + arr[j];
            }

            rightSum = 0;
            for(j=i+1; j<arr.length; j++){
                rightSum = rightSum + arr[j];
            }

            if(leftSum == rightSum)
                return i;
        }

        return -1;
    }

    // Time complexity: O(N)
    static int findEquilibrium_efficientWay(int[] arr){
        int i;
        int sum=0, leftSum=0;
        for(i=0;i<arr.length; i++){
            sum += arr[i];
        }

        for(i=0;i<arr.length;i++){
            sum -= arr[i];

            if(sum == leftSum)
                return i;

            leftSum += arr[i];
        }

        return -1;
    }

    // https://practice.geeksforgeeks.org/viewSol.php?subId=b37e82c707a7965ea7c5234a81987f4e&pid=703092&user=karthikvn23
    static void verifyTwoNumberSumExists(int[] arr, int sum){
        int temp;
        HashSet<Integer> tempSet = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++){
            temp = sum - arr[i];
            if(tempSet.contains(temp)){
                System.out.println(String.format("Numbers whose sum equal to given result sum: %d, %d", arr[i], temp));
            }
            tempSet.add(arr[i]);
        }
    }
}
