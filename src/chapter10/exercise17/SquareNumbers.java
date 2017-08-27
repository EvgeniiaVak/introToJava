package chapter10.exercise17;

import java.math.BigInteger;

public class SquareNumbers {
    public static void main(String[] args) {

        //find the first base
        long rootOfLongCasted = (long) Math.sqrt(Long.MAX_VALUE);
//        long largestSquareLong = rootOfLongCasted * rootOfLongCasted;
//        System.out.println(rootOfLongCasted);
//        System.out.println(largestSquareLong);
        long largerRoot = rootOfLongCasted + 1;

        BigInteger base = new BigInteger(String.valueOf(largerRoot));

        for (int i = 1; i <= 10; i++) {
            System.out.println("Square number #" + i);
            BigInteger square = base.multiply(base);
            System.out.println(square + "\n\n");

            base = base.add(BigInteger.ONE);
        }


    }
}
