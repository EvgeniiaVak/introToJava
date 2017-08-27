package chapter10.exercise05;

import chapter05.FactorsOfInteger;
import chapter05.PrimeNumbers;

import java.util.Scanner;

public class TestStackOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //10.5prompt the user to enter a positive integer and displays all its smallest factors in decreasing order
//        System.out.println("Enter an integer: ");
//        int number = 120;//scanner.nextInt();
//        int[] factors = FactorsOfInteger.getFactors(number);
//
//        for (int i = factors.length - 1; i >= 0; i--) {
//            System.out.print(factors[i] + " ");
//        }
//        System.out.println();

        //10.6 display all the prime numbers less than 120 in decreasing order
        StackOfIntegers stack = new StackOfIntegers(120);
        int number = 2;

        do {
            if (PrimeNumbers.isPrime(number)) {
                stack.push(number);
            }
            number++;
        } while (stack.getSize() != 120);

        System.out.println(stack);

    }
}
