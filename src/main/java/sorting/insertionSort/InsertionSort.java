package sorting.insertionSort;

public class InsertionSort {

    // Time Complexity: O(log n)

    public static void main(String[] args){

        ascendingOrderSort();
        descendingOrderSort();

    }

    static void ascendingOrderSort(){

        System.out.println("Ascending order");

        int[] array = {31,41,59,26,41,58};
        int key;

        for(int j=1; j<=array.length-1; j++){
            key = array[j];
            int i = j-1;
            while(i>=0 && array[i] > key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key; // We are storing key in 1+1 because i would have been decremented prior to the condition becoming false in while loop
        }

        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }

    static void descendingOrderSort(){

        System.out.println("Descending order");

        int[] array = {31,41,59,26,41,58};
        int key;

        for(int j=1; j<=array.length-1; j++){
            key = array[j];
            int i = j-1;
            while(i>=0 && array[i] < key){
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }

        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}
