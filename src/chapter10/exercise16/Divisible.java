package chapter10.exercise16;

import java.math.BigInteger;

public class Divisible {
    public static void main(String[] args) {
        //10.16 Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.

        BigInteger bigNum = new BigInteger(
                "10000000000000000000000000000000000000000000000000");

        int counter = 0;
        do {
            if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                counter++;
            }

            bigNum = bigNum.add(BigInteger.ONE);
        } while (counter < 10);


    }
}
