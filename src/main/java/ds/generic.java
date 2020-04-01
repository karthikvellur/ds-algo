package ds;

public class generic {

    public static void main(String[] args){
//        isNumberPrime(1);
//        System.out.println("Factorial: " + factorial(3));
        reverseArray();
    }

    // Time Complexity: O(sqrt(N)): The for loop wi ll start when i = 2 and end when i * i = n. Or, in other words, it stops when x = sqrt(n)
    static void isNumberPrime(int num){
        boolean isPrime = true;

        if(num != 0 || num !=1){
            for(int i=2; i*i<num; i++){
                if(num % i == 0){
                    System.out.println("Number is not prime");
                    isPrime = false;
                }
            }

            if(isPrime)
                System.out.println("Number is prime");
        }
    }

    // Time complexity: O(N) - Since N number of calls happen which are stored on the stack during recursion process
    static int factorial(int num){
        if(num < 0)
            return  -1;
        else if(num == 0 || num  == 1)
            return 1;
        else
            return num * factorial(num-1);

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
}
