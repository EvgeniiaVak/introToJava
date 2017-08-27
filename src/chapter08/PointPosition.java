package chapter08;

import chapter10.exercise04.MyPoint;
import chapter10.exercise12.Line2D;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public enum  PointPosition {
    ON_THE_LEFT_SIDE, ON_THE_SAME_LINE, ON_THE_RIGHT_SIDE;

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/test_point_position.txt"));
        Scanner scanner = new Scanner(is);

        for (int i = 0; i < 5; i++) {
            double[] point = readPoint(scanner);
            double[][] line = {
                    readPoint(scanner),
                    readPoint(scanner)
            };

            PointPosition position = find(point, line);
            System.out.println(position);
        }


        scanner.close();
        is.close();
    }

    public static double[] readPoint(Scanner scanner) {
        double[] result = new double[2];

        for (int i = 0; i < 2; i++) {
            result[i] = scanner.nextDouble();
        }

        return result;
    }

    public static PointPosition find(MyPoint point, Line2D line) {
        double[] pointToCheck = {
            point.getX(),
            point.getY()
        };

        double[][] lineToCompare = {
                {line.getP1().getX(), line.getP1().getY()},
                {line.getP2().getX(), line.getP2().getY()}
        };

        return find(pointToCheck, lineToCompare);
    }

    public static PointPosition find(double[] point, double[][] line) {
        double[] pointA = line[0];
        double[] pointB = line[1];

        return find(point, pointA, pointB);
    }

    public static PointPosition find(double[] pointToCheck, double[] pointA, double[] pointB) {
        double  x0 = pointA[0],
                y0 = pointA[1],
                x1 = pointB[0],
                y1 = pointB[1],

                x2 = pointToCheck[0],
                y2 = pointToCheck[1];


        double result =  (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);

        if (result > 0)
            return ON_THE_LEFT_SIDE;
        else if (result == 0)
            return ON_THE_SAME_LINE;
        else
            return ON_THE_RIGHT_SIDE;
    }


}
