package chapter05;

/*
* (Decimal to binary) Write a program that prompts the user to enter a decimal
* integer and displays its corresponding binary value. Don’t use Java’s
* Integer.toBinaryString(int) in this program.
* */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a decimal integer");
        int input = scanner.nextInt();
        String binary = "";
        for (int decimal = input; decimal > 0; decimal /= 2) {
            binary = (decimal % 2) + binary;
        }

        System.out.println(binary);
        System.out.println("DEBUG: " + Integer.toBinaryString(input));
    }
}
