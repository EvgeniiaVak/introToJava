package chapter08;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FourConsecutiveNumbers {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/nines.txt"));// TODO: 8/11/17 add file
        Scanner scanner = new Scanner(is);
        int[][] matrix = new int[6][7];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println(isConsecutiveFour(matrix));

        scanner.close();
        is.close();
    }

    public static boolean isConsecutiveFour(int[][] values) {
        //check horizontally
        for (int row = 0; row < values.length; row++) {
            if (hasFour(values[row]))
                return true;
        }

        //check vertically
        for (int j = 0; j < values[0].length; j++) {
            int[] column = new int[values[0].length];

            for (int i = 0; i < values.length; i++) {
                column[i] = values[i][j];
            }
            if (hasFour(column))
                return true;
        }


        //check diagonals from left-bottom to right-top
        if (checkMajorDiagonals(values))
            return true;



        //check diagonals from left-top to right-bottom
        if (checkSubDiagonals(values))
            return true;


        return false;
    }

    private static boolean checkSubDiagonals(int[][] values) {
        //start with the row that is 3 higher than bottom (small diagonals do not matter)
        int startRow = values.length - 4;// 2
        int startColumn = 0;
        int lastColumn = values[0].length - 1;



        while (startColumn < lastColumn - 3) {//till start column becomes larger than last column - 3 (small diagonals do not matter)

            int[] diagonal;
            if (startRow >= 0) {
                diagonal = new int[values.length - startRow];
                for (int i = 0; i < diagonal.length; i++) {
                    diagonal[i] = values[startRow + i][i];
                }
                startRow--;

            } else {
                diagonal = new int[lastColumn - startColumn];
                for (int i = 0; i < diagonal.length; i++) {
                    diagonal[i] = values[i][startColumn + i + 1];
                }
                startColumn++;
            }

            if (hasFour(diagonal))
                return true;
        }

        return false;
    }

    private static boolean checkMajorDiagonals(int[][] values) {
        //start with a third row (smaller diagonals have less than needed digits anyway)
        int startRow = 3;
        int startColumn = 0;
        int lastRow = values.length - 1;
        int lastColumn = values[0].length - 1;


        while (startColumn < lastColumn - 3) {// (small diagonals do not matter)

            int[] diagonal;
            if (startRow <= lastRow) {
                //before reaching the bottom
                //in this part size of diagonal is the row
                diagonal = new int[startRow + 1];
                for (int i = 0; i <= startRow; i++) {
                    diagonal[i] = values[startRow - i][i];
                }
                startRow++;
            } else {
                //on reaching last row, start increasing columns and stop increasing rows for start of diagonal
                diagonal = new int[lastColumn - startColumn];
                for (int i = 0; i < diagonal.length; i++) {
                    diagonal[i] = values[lastRow - i][startColumn + i + 1];
                }
                startColumn++;
            }

            if (hasFour(diagonal))
                return true;
        }
        return false;
    }

    private static boolean hasFour (int[] line) {
        int sum = 1;
        for (int i = 0; i < line.length; i++) {
            if (i != 0 && line[i] == line[i - 1]) {
                sum++;
                if (sum == 4)
                    return true;
            }
            else
                sum = 1;
        }
        return false;
    }
}
