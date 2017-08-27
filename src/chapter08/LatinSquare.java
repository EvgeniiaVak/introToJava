package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class LatinSquare {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/latin.txt"));
        Scanner scanner = new Scanner(is);

        /*
        * Enter number n: 4
        * Enter 4 rows of letters separated by spaces:
        * A B C D
        * B A D C
        * C D B A
        * D C A B
        * The input array is a Latin square
        *
        * Enter number n: 3
        * Enter 3 rows of letters separated by spaces:
        * A F D
        * Wrong input: the letters must be from A to C
        * */

        char[][] square1 = readInput(scanner);
        outputResult(square1);


        char[][] square2 = readInput(scanner);
        outputResult(square2);

        scanner.close();
        is.close();
    }

    private static void outputResult(char[][] square) {
        if (square != null) {
            if (isLatinSquare(square)) {
                System.out.println("The input array is a Latin square");
            } else {
                System.out.println("The input array is not a Latin square");
            }
        } else {
            System.out.println("Nothing to show");
        }

        System.out.println("\n");
    }

    /** A Latin square is an n-by-n array filled with n different Latin letters,
    * each occurring exactly once in each row and once in each column. */
    public static boolean isLatinSquare(char[][] square) {
        //check rows
        for (int row = 0; row < square.length; row++) {
            if (!isLatinLine(square[row]))
                return false;
        }
        for (int j = 0; j < square[0].length; j++) {
            char[] column = new char[square.length];
            for (int i = 0; i < square.length; i++) {
                column[i] = square[i][j];
            }

            if (!isLatinLine(column))
                return false;
        }

        return true;
    }

    private static boolean isLatinLine(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'A' || chars[i] > 'A' + chars.length - 1)
                return false;
        }

        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j])
                    return false;
            }
        }

        return true;
    }


    private static char[][] readInput(Scanner scanner) {
        System.out.print("Enter the size of the square: ");
        int n = scanner.nextInt();
        System.out.println(n);
        if (n < 1 || n > 26) {
            System.out.println("Wrong input! there are 26 letters, pick the size between 1 and 26");
            return null;
        }
        char[][]result = new char[n][n];

        System.out.printf("Enter %d rows of letters separated by spaces:%n", n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char k = scanner.next().toUpperCase().charAt(0);
                if (k < 'A' || k > 'A' + n - 1) {
                    System.out.printf("Wrong input: the letters must be from %c to %c!%n", 'A', (char) ('A' + n - 1));
                    return null;
                }
                result[i][j] = k;
                System.out.printf("%3c ", k);
            }
            System.out.println();
        }
        System.out.println();

        return result;
    }
}
