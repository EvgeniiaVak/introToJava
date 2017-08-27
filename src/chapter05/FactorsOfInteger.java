package chapter05;

/*
* (Find the factors of an integer) Write a program that reads an integer and displays all
* its smallest factors in increasing order. For example, if the input integer is 120,
* the output should be as follows: 2, 2, 2, 3, 5.
*
* 1. number = input
*
* 2. divisor = 2
*
* 3. if number % divisor is zero => divisor is a factor
*       4. number becomes number / divisor, repeat 3.
*
* 5. else increment divisor
*
* 6. if divisor is equal input stop, else repeat 3.
* */

import chapter10.exercise05.StackOfIntegers;

import java.util.Scanner;

public class FactorsOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int input = scanner.nextInt();

        String output = "";
        int factor = 2;
        while (factor < input) {
            if (input % factor == 0) {
                output += factor + ", ";
                input = input / factor;
            } else {
                factor++;
            }
        }

        // don't forget the last factor
        output += factor;
        System.out.println(output);

    }

    public static int[] getFactors(int number) {
        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;
        while (factor < number) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }
        stack.push(factor);

        return stack.getElements();
    }
}
