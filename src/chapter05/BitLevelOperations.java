package chapter05;

/*
* (Computer architecture: bit-level operations) A short value is stored in 16 bits.
* Write a program that prompts the user to enter a short integer and displays the 16 bits for the integer.
* (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND operator (&)
* */

import java.util.Scanner;

public class BitLevelOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a short integer:");
        int input = 34;//scanner.nextInt();

        System.out.print("The 16 bits are ");
        int mask = 1;
        for (int i = 15; i >= 0; i--) {
            int temp = input >> i;
            //System.out.println(Integer.toBinaryString(temp));
            int bit = temp & mask;
            //System.out.println(Integer.toBinaryString(bit));
            System.out.print(bit);
        }
    }


}
