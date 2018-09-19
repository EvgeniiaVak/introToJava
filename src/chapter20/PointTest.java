package chapter20;

import java.util.Arrays;

class PointTest {
    public static void main(String[] args) {

        int n = 100;
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(Math.random(), Math.random());
        }

        System.out.println("Points by X: ");
        Arrays.sort(points);
        for (Point point : points) {
            System.out.println(point);
        }

        System.out.println("\n\n");
        System.out.println("Points by Y: ");
        Arrays.sort(points, new PointComparatorByY());
        for (Point point : points) {
            System.out.println(point);
        }
    }
}