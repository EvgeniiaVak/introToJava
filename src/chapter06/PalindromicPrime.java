package chapter06;

import chapter05.PrimeNumbers;

public class PalindromicPrime {
    public static void main(String[] args) {

        int sum = 0;
        int number = 2;
        while (sum < 100) {
            if (isPalindromicPrime(number)) {
                sum++;
                System.out.print(" " + number);
                if (sum % 10 == 0) System.out.println();
            }
            number++;
        }

    }

    public static boolean isPalindromicPrime(int number) {
        return PalindromeInteger.isPalindrome(number) && PrimeNumbers.isPrime(number);
    }
}
