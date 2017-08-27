package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/markov2.txt"));
        Scanner scanner = new Scanner(is);

        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double k = matrix[i][j] = scanner.nextDouble();
                System.out.printf(" %.3f", k);
            }
            System.out.println();
        }

        String negation = (isMarkovMatrix(matrix)) ? "" : "not ";

        System.out.printf("It is %sa Markov matrix", negation);

        scanner.close();
        is.close();
    }

    public static boolean isMarkovMatrix(double[][] m) {
        int n = m.length;
        //check every column
        for (int i = 0; i < n; i++) {
            double sum = 0;

            for (int j = 0; j < n; j++) {
                double k = m[j][i];
                if (k < 0)
                    return false;
                else
                    sum += k;
            }
            if (sum != 1)
                return false;
        }


        return true;
    }
}
