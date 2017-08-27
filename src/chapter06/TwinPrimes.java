package chapter06;

import chapter05.PrimeNumbers;

public class TwinPrimes {

    public static void main(String[] args) {
        int number1 = 2;
        int number2 = findNextPrime(number1);

        while (number2 < 1000) {
            if (areTwinPrimes(number1, number2)) {
                System.out.printf("(%d, %d)%n", number1, number2);
            }
            number1 = number2;
            number2 = findNextPrime(number1);
        }

    }

    public static boolean areTwinPrimes(int number1, int number2) {
        return PrimeNumbers.isPrime(number1) &&
                PrimeNumbers.isPrime(number2) &&
                number2 - number1 == 2;
    }

    public static int findNextPrime (int prime1) {
        int prime2 = prime1 + 1;
        while (!PrimeNumbers.isPrime(prime2)) {
            prime2++;
        }
        return prime2;
    }
}
