package chapter10.exercise19;

/*
* (Mersenne prime) A prime number is called a Mersenne prime if it can
* be written in the form 2^p - 1 for some positive integer p. Write a program
* that finds all Mersenne primes with p <= 100 and displays the output as
* shown below. (Hint: You have to use BigInteger to store the number,
* because it is too big to be stored in long. Your program may take several hours to run.)
*
*
* p         2^p – 1
* 2         3
* 3         7
* 5         31
* ...
*
* */

import chapter10.exercise18.TextBookSolution;

import java.math.BigInteger;

public class BigMersennePrime {
    public static void main(String[] args) {
        int p = 2;

        while (p < 100) {
            BigInteger number = getBigMersenneInteger(p);
            if (TextBookSolution.isPrime(number)) {
                System.out.println(p + "        " + number);
            }

            p++;
        }
    }

    public static BigInteger getBigMersenneInteger (int p) {
        return new BigInteger("2").pow(p).subtract(BigInteger.ONE);
    }
}
