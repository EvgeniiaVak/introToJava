package chapter06;

import chapter05.PrimeNumbers;

public class Emirp {
    public static void main(String[] args) {
        int sumEmirps = 0;
        int number = 2;

        while (sumEmirps < 100) {
            if (isEmirp(number)) {
                sumEmirps++;
                System.out.print(" " + number);
                if (sumEmirps % 10 == 0) System.out.println();
            }
            number++;
        }
    }

    public static boolean isEmirp(int number) {
        return  PrimeNumbers.isPrime(number) &&
                PrimeNumbers.isPrime(PalindromeInteger.reverse(number)) &&
                !PalindromeInteger.isPalindrome(number);
    }
}
