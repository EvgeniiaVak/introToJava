package chapter02;

/**
 * Created by evgeniyavakarina on 7/18/17.
 *
 * (Print a table) Write a program that displays the following table:
 a      b       pow(a, b)
 1      2      1
 2      3      8
 3      4      81
 4      5      1024
 5      6      15625
 */
public class PowerTable {

    public static void main(String[] args) {
        System.out.println("\ta\t\tb\t\tpow(a, b)");
        for (int i = 1; i < 7; i++) {
            System.out.println(
                    "\t" + i +
                    "\t\t" + (i+1) +
                    "\t\t" + (int) (Math.pow(i, (i + 1)))
            );
        }
    }
}
