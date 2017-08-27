package chapter10.exercise15;

import chapter10.exercise13.MyRectangle2D;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.CharBuffer;
import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter10/exercise15/points.txt"));
        Scanner scanner = new Scanner(is);

        //Enter five points: 1.0 2.5 3 4 5 6 7 8 9 10
        //The bounding rectangle's center (5.0, 6.25), width 8.0, height 7.5
        double[][] points = readPoints(scanner);
        MyRectangle2D rectangle2D = getRectangle(points);
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.2f, height %.2f%n",
                rectangle2D.getX(), rectangle2D.getY(),
                rectangle2D.getWidth(), rectangle2D.getHeight()
        );

        scanner.close();
        is.close();
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        //find the bounds - the extremes
        double highest = points[0][1], lowest = points[0][1],
                rightest = points[0][0], leftest = points[0][0];

        for (int i = 1; i < points.length; i++) {
            if (points[i][1] > highest)
                highest = points[i][1];
            if (points[i][1] < lowest)
                lowest = points[i][1];
            if (points[i][0] > rightest)
                rightest = points[i][0];
            if (points[i][0] < leftest)
                leftest = points[i][0];
        }

        // they will determine the points of the BoundingRectangle
        double length = Math.abs(rightest - leftest);
        double height = Math.abs(highest - lowest);
        double posX = rightest - length / 2;
        double posY = highest - height / 2;

        return new MyRectangle2D(posX, posY, length, height);
    }

    public static double[][] readPoints(Scanner scanner) {
        int numberOfPoints = scanner.nextInt();
        double[][] result = new double[numberOfPoints][2];

        for (int i = 0; i < numberOfPoints; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = scanner.nextDouble();
            }
        }

        return result;
    }
}
