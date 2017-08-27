package chapter08;

import java.util.Arrays;

public class NearestPoints3D {
    public static void main(String[] args) {
        double[][] points = {
                {-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        int pointA = 0;
        int pointB = points.length - 1;


        double distance = getDistance(points[pointA], points[pointB]);

        for (int point = 0; point < points.length - 1; point++) {
            for (int nextPoint = 0; nextPoint < points.length; nextPoint++) {
                if (point != nextPoint) {
                    double newDistance = getDistance(points[point], points[nextPoint]);
                    if (newDistance < distance) {
                        distance = newDistance;
                        pointA = point;
                        pointB = nextPoint;
                    }
                }
            }
        }

        System.out.printf("The smallest distance is %.2f between points %s and %s%n",
                distance,
                Arrays.toString(points[pointA]),
                Arrays.toString(points[pointB]));
    }

    public static double getDistance (double[] a, double[] b){
        if (a.length != 3 || b.length != 3)
            return -1;

        return Math.sqrt(
                Math.pow(b[0] - a[0], 2) +
                Math.pow(b[1] - a[1], 2) +
                Math.pow(b[2] - a[2], 2)

        );
    }
}
