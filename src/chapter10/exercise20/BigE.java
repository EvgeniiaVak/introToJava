package chapter10.exercise20;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigE {

    public static void main(String[] args) {
        System.out.println("E is: ");
        System.out.println(
                "2.71828182845904523536028747135266249775724709369995..."
        );
        System.out.println("\n");

        for (int i = 3; i < 100; i += 1) {
            System.out.println(get(i, 25 + i));
        }
    }


    public static BigDecimal get(long computeOn, int precision) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal item = BigDecimal.ONE;

        for (long i = 2; i < computeOn; i++) {
            result = result.add(item);
            item = item.divide(new BigDecimal(i), precision, BigDecimal.ROUND_UP);
        }

        return result;
    }

}
