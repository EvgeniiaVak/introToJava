package chapter06;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        long n = scanner.nextLong();
        System.out.println("It's digits' sum is: " + sumDigits(n));
    }

    public static int sumDigits(long n) {
        long nLeft = n;
        int sum = 0;
        while (nLeft > 0) {
            sum += nLeft % 10;
            nLeft /= 10;
        }
        return sum;
    }

}
