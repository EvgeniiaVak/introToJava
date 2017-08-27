package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class InputReader {

    public static void main(String[] args) {
        int[][] test = getIntArray8to7FromFile("src/chapter08/workinghours.txt");
        System.out.println(Arrays.toString(test[0]));
    }

    public static int[][] getIntArray8to7FromFile(String fileName) {
        int[][] result = new int[8][7];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                result[counter / 7][ counter % 7] = number;
                counter++;
            }
        } catch (java.io.IOException e) {
            System.out.println("Couldn't read file");
            e.printStackTrace();
        }

        return result;
    }

    public static int[][] getIntArrayFromFile(String fileName, int rows, int columns) {
        int[][] result = new int[rows][columns];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                result[counter / columns][ counter % columns] = number;
                counter++;
            }
        } catch (java.io.IOException e) {
            System.out.println("Couldn't read file");
            e.printStackTrace();
        }

        return result;
    }

    public static double[][] getDoubleArrayFromFile(String fileName, int rows, int columns) {
        double[][] result = new double[rows][columns];

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                result[counter / columns][ counter % columns] = number;
                counter++;
            }
        } catch (java.io.IOException e) {
            System.out.println("Couldn't read file");
            e.printStackTrace();
        }

        return result;
    }
}
