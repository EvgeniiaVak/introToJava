package chapter06;

import chapter05.PrimeNumbers;

public class MersennePrime {

    public static void main(String[] args) {
        int p = 2;

        while (p < 32) {
            long number = getMersenneInteger(p);
            if (PrimeNumbers.isPrime(number)) {
                System.out.println(p + "        " + number);
            }

            p++;
        }
    }

    public static int getMersenneInteger (int p) {
        return (int) (Math.pow(2, p) - 1);
    }
}
