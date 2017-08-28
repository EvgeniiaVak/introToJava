package chapter10.exercise21;

/*
* (Divisible by 5 or 6) Find the first ten numbers greater than
* Long.MAX_VALUE that are divisible by 5 or 6.
* */

import java.math.BigInteger;

public class DivisibleBy5Or6 {
    public static void main(String[] args) {
        BigInteger big = new BigInteger(String.valueOf(Long.MAX_VALUE));

        int count = 0;
        while (count < 10) {
            big = big.add(BigInteger.ONE);

            if (isDivisible(big)) {
                count++;
                System.out.println("# " + count + ": " + big);
            }
        }

    }

    public static boolean isDivisible (BigInteger big) {
        return  isDivisible(big, "5") || isDivisible(big, "6");
    }

    public static boolean isDivisible(BigInteger big, String by) {
        return big.remainder(new BigInteger(by)).equals(BigInteger.ZERO);
    }
}
