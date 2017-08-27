package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class FlippedCell {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/flipped.txt"));
        Scanner scanner = new Scanner(is);
        int n = scanner.nextInt(); //matrix size
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = matrix[i][j] = scanner.nextInt();
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int r = findFirstWrongRow(matrix);
        int c = findFirstWrongColumn(matrix);

        System.out.printf("The flipped cell is at row %d, column %d.%n", r, c);

        scanner.close();
        is.close();
    }

    private static int findFirstWrongColumn(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int[] column = new int[matrix[0].length];

            for (int j = 0; j < column.length; j++) {
                column[j] = matrix[j][i];
            }

            if (!hasEven1(column))
                return i;
        }
        return -1;
    }

    private static int findFirstWrongRow(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (!hasEven1(matrix[i]))
                return i;
        }

        return -1;
    }

    private static boolean hasEven1(int[] matrix) {
        int numberOf1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 1)
                numberOf1++;
        }

        return numberOf1 % 2 == 0;
    }
}
