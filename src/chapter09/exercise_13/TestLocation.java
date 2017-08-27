package chapter09.exercise_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter09/exercise_13/array.txt"));
        Scanner scanner = new Scanner(is);

        // Enter the number of rows and columns in the array:  3 4
        // Enter the array:
        // 23.5 35 2 10
        // 4.5 3 45 3.5
        // 35 44 5.5 9.6
        // The location of the largest element is 45 at (1, 2)

        System.out.println("Enter the number of rows and columns in the array: ");
        double[][] array = new double[scanner.nextInt()][scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        Location location = Location.locateLargest(array);
        System.out.printf("The location of the largest element is %f at (%d, %d)%n",
                location.getMaxValue(), location.getRow(), location.getColumn());

        scanner.close();
        is.close();
    }
}
