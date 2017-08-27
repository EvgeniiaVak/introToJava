package chapter06;

import java.util.Scanner;

public class PalindromeInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        System.out.println("is it a palindrome? " + isPalindrome(number));
    }


    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        return result;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        if (number == reverse(number))
            return true;
        else
            return false;
    }
}
