package chapter12.exercise10;

import java.math.BigInteger;
import java.util.ArrayList;

public class JVMBreaker {
    public static void main(String[] args) {
        try {
            BigInteger big = new BigInteger("9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
            ArrayList<String> hugeList = new ArrayList<>();
            for (BigInteger i = BigInteger.ZERO; i.compareTo(big) < 0; i.add(BigInteger.ONE)) {
                hugeList.add(new String("some string " + i));
            }
        } catch (OutOfMemoryError e) {
            System.out.println("CAUGHT OUT OF MEMORY: " + e.getMessage());
        }

        System.out.println("proceed main");
    }
}
