package chapter08;

import java.util.Arrays;

public class ShuffleRows {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
        System.out.println("\n");
        shuffle(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

    /** shuffles the rows in a two-dimensional int array */
    public static void shuffle(int[][] m) {
        int numberOfRows = m.length;
        for (int row = 0; row < numberOfRows; row++) {
            int rand = (int) (Math.random() * numberOfRows);
            int[] temp = m[row];
            m[row] = m[rand];
            m[rand] = temp;
        }
    }
}
