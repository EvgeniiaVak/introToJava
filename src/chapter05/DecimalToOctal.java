package chapter05;

/*
* (Decimal to octal) Write a program that prompts the user to enter a decimal
* integer and displays its corresponding octal value. Don’t use Java’s
* Integer.toOctalString(int) in this program.
* */

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a decimal integer");
        int input = scanner.nextInt();

        String octal = "";
        for (int decimal = input; decimal > 0; decimal /= 8) {
            octal = (decimal % 8) + octal;
        }

        System.out.println(octal);
        System.out.println("DEBUG: " + Integer.toOctalString(input));
    }
}
