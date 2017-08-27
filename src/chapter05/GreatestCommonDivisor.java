package chapter05;

/*
* (Compute the greatest common divisor) Another solution for Listing 5.9 to find the
* greatest common divisor of two integers n1 and n2 is as follows:
* First find d to be the minimum of n1 and n2,
* then check whether d, d-1, d-2, ..., 2, or 1 is a divisor for both n1 and n2 in this order.
* The first such common divisor is the greatest common divisor for n1 and n2.
* Write a program that prompts the user to enter two positive integers and displays the gcd.
* */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask for two integers
        System.out.println("enter two positive integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int min = (a > b) ? b : a;

        int gcd = -1;
        for (int i = 0; i < min; i++) {
            int c = min - i;
            if (a % c == 0 && b % c == 0) {
                gcd = c;
                break;
            }
        }
        System.out.println("the greatest common divisor is " + gcd);
    }
}
