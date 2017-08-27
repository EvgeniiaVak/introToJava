package chapter08;

import java.util.Arrays;

public class Sudoku {

    public static void main(String[] args) {
        int[][] solution = {    {5, 3, 4, 6, 7, 8, 9, 1, 2},
                                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[] row = {3, 4, 5, 2, 8, 6, 1, 7, 9};

        boolean is = hasUniqueDigits1to9(row);
        System.out.println(is);

        boolean isValid = isValid(solution);
        System.out.println(isValid);
    }


    public static boolean isValid(int[][] solution) {

        //check for duplicates
        //every row
        for (int row = 0; row < solution.length; row++) {
            if (!hasDigits1to9(solution[row]))
                return false;
        }

        //search each column
        for (int i = 0; i < solution.length; i++) {
            //look though every row
            int[] column = new int[solution.length];
            for (int row = 0; row < solution.length; row++) {
                //find needed value and place it to column
                column[row] = solution[row][i];
            }

            if (!hasDigits1to9(column))
                return false;
        }


        //every 3x3 block
        //these for loops are just for finding starting indices of blocks
        for (int i = 0; i <= 6; i += 3) {
            for (int j = 0; j <= 6; j+= 3) {
                int[] block = getBlock(solution, i, j);

                if (!hasUniqueDigits1to9(block))
                    return false;
            }
        }


        return true;
    }

    private static int[] getBlock(int[][] solution, int rowStart, int cellStart) {
        int rowEnd = rowStart + 3;
        int cellEnd = cellStart + 3;

        //the first block starts at solution[0][0]
        int[] block = new int[solution.length];
        int index = 0;
        for (int row = rowStart; row < rowEnd; row++) {
            for (int cell = cellStart; cell < cellEnd; cell++) {
                block[index] = solution[row][cell];
                index++;
            }
        }
        return block;
    }

    private static boolean hasUniqueDigits1to9 (int[] toCheck) {
        for (int i = 0; i < toCheck.length - 1; i++) {
            for (int j = i + 1; j < toCheck.length; j++) {
                if (    !isBetween1and9(toCheck[i]) ||
                        !isBetween1and9(toCheck[j]) ||
                        toCheck[i] == toCheck[j])
                    return false;
            }
        }
        return true;
    }

    private static boolean isBetween1and9(int number) {
        return number > 0 && number < 10;
    }

    private static boolean hasDigits1to9(int[] toCheck) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < toCheck.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (toCheck[i] == digits[j])
                    digits[j] = -1;
            }
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0)
                return false;
        }
        return true;
    }
}
