package chapter18;

import java.util.Scanner;

public class FibTailRecursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index for a Fibonacci number: ");
        int index = input.nextInt();

        // Find and display the Fibonacci number
        System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
    }

    /** The method for finding the Fibonacci number */
    public static long fib(long index){
        if (index == 0)// Base case
            return 0;
        else if (index == 1) // Base case return 1;
            return 1;

        return fib(2, index, 1, 0);
    }

    public static long fib (long index, long targetIndex, long a, long b){

        long result = a + b;

        if (index == targetIndex)
            return result;

        return fib(index + 1, targetIndex, result, a);
    }
}
