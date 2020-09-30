package ds;

public class math {

    public static void main(String[] args){
//        isNumberPrime(1);

//        System.out.println("Factorial: " + factorial(3));

//        System.out.println("Fibonacci via recursion: " + fibonacciRecur(4));
//        fibonacciIterative(4);

        sieveOfEratosthenes();

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

    // Efficiency : O(N * N)
    static void sieveOfEratosthenes(){
        int n = 10;
        boolean[] arr = new boolean[n];
        for(int i=2; i<n; i++){
            arr[i] = true;
        }

        for(int i=2; i<n; i++){
            if(arr[i] != false){
                for(int j=i; i*j<n; j++){
                    arr[i*j] = false;
                }
            }
        }

        for(int i=2; i<n; i++){
            if(arr[i])
                System.out.println(i);
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



    static int fibonacciRecur(int num){
        if(num <= 0)
            return 0;
        if(num == 1)
            return 1;
        return fibonacciRecur(num-1) + fibonacciRecur(num-2);
    }

    static void fibonacciIterative(int num){
        int fib = 0;
        if( num <= 0)
            fib = 0;
        else if (num == 1)
            fib = 1;
        else {
            fib = 1;
            int prevFib = 1;
            for(int i=2; i<num; i++){
                int temp = fib;
                fib = fib  + prevFib;
                prevFib = temp;
            }
        }
        System.out.println("Fibonacci, iterative method: " + fib);
    }
}
