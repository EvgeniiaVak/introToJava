package chapter04;

/*
* Geometry: great circle distance) The great circle distance is the distance between
* two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
* latitude and longitude of two points. The great circle distance between the two points
* can be computed using the following formula:
* d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
* Write a program that prompts the user to enter the latitude and longitude of two points
* on the earth in degrees and displays its great circle distance. The average earth radius
* is 6,371.01 km. Note that you need to convert the degrees into radians using the Math.toRadians method
* since the Java trigonometric methods use radians. The latitude and longitude degrees in the
* formula are for north and west. Use negative to indicate south and east degrees.
* */

import java.util.Scanner;

public class GreatCircleDistance {
    public static final double AVERAGE_EARTH_RADIUS = 6371.01;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt the user to enter the latitude and longitude
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());

        //The great circle distance between the two points can be computed using the following formula:
        double d = getGreatCircleDistance(false, x1, y1, x2, y2);

        System.out.printf("The distance between the two points is %f km%n", d);
    }

    public static double getGreatCircleDistance(boolean isInDegrees, double x1, double y1, double x2, double y2) {
        if (isInDegrees) {
            x1 = Math.toRadians(x1);
            y1 = Math.toRadians(y1);
            x2 = Math.toRadians(x2);
            y2 = Math.toRadians(y2);
        }

        return AVERAGE_EARTH_RADIUS *
                Math.acos(
                        Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
                );
    }
}
