package sorting;

public class bubbleSort {

    // Time Complexity: O(N*N)

    public static void main(String[] args){
        int[] array = {41,31,59,26,41,58};

        boolean swapped;

        for(int i=0;i<array.length;i++){

            swapped = false;

            for(int j=0;j<array.length-i-1;j++){

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swapped = true;
                }
            }

            if( ! swapped)
                break;
        }

        System.out.println("After Sort");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
