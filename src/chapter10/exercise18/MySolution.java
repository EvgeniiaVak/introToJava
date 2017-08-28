package chapter10.exercise18;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MySolution {
    public static void main(String[] args) {
        //make String[] array with prime numbers below maximum Long value
        List<Long> primesLong = new ArrayList<>();
        primesLong.add(2L);
        primesLong.add(3L);

        //add each prime to
        List<BigInteger> bigPrimes = new ArrayList<>();
        bigPrimes.add(new BigInteger(String.valueOf(2)));
        bigPrimes.add(new BigInteger(String.valueOf(3)));

        for (long i = 4; i < Long.MAX_VALUE; i++) {
            if (preparePrimes(i, primesLong, bigPrimes)) {
                primesLong.add(i);
            }
        }

        //show 5 prime numbers larger than long max value
        System.out.println("BIG PRIMES: ");
        BigInteger possibleBigPrime = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;
        while (count < 5) {
            possibleBigPrime = possibleBigPrime.nextProbablePrime();

            if (addBigPrime(possibleBigPrime, bigPrimes)) {
                System.out.println(possibleBigPrime);
                count++;
            }
        }

    }

    public static boolean addBigPrime(BigInteger bigInteger, List<BigInteger> bigPrimes) {
        for (BigInteger bigPrime :
                bigPrimes) {
            if (bigInteger.remainder(bigPrime).equals(BigInteger.ZERO))
                return false;
        }

        bigPrimes.add(bigInteger);
        return true;
    }

    public static boolean preparePrimes(long i, List<Long> knownPrimes, List<BigInteger> bigPrimes) {

        for (Long prime :
                knownPrimes) {
            if (i % prime == 0)
                return false;
        }

        bigPrimes.add(new BigInteger(String.valueOf(i)));
        return true;
    }
}
