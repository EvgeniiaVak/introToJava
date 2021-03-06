package chapter05;

/*
* (Perfect number) A positive integer is called a perfect number if it is equal to the
* sum of all of its positive divisors, excluding itself. For example, 6 is the first
* perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1.
* There are four perfect numbers less than 10,000. Write a program to find all these four numbers.
* */

public class PerfectNumber {
    public static void main(String[] args) {
        for (int number = 6; number < 10000; number++) {
            int sumOfDivisors = 0;
            int divisor;
            for (divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sumOfDivisors += divisor;
                }
            }
            if (number == sumOfDivisors) System.out.println("We found a perfect number, it is " + divisor);
        }
    }
}
