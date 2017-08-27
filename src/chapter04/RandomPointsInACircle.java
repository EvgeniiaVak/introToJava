package chapter04;

/*
* (Random points on a circle) Write a program that generates three random points on a circle centered at (0, 0)
* with radius 40 and display three angles in a triangle formed by these three points, as shown in Figure 4.7a.
* (Hint: Generate a random angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point
* determined by this angle is (r*cos(a), r*sin(a)).)
* */

public class RandomPointsInACircle {
    public static final double RADIUS = 40;

    public static void main(String[] args) {

        //generate random angle
        double angle = getRandomAngle();
        double xOfPointA = RADIUS * Math.cos(angle);
        double yOfPointA = RADIUS * Math.sin(angle);
        System.out.printf("Point A coordinates: %f, %f%n", xOfPointA, yOfPointA);

        angle = getRandomAngle();
        double xOfPointB = RADIUS * Math.cos(angle);
        double yOfPointB = RADIUS * Math.sin(angle);
        System.out.printf("Point B coordinates: %f, %f%n", xOfPointB, yOfPointB);

        angle = getRandomAngle();
        double xOfPointC = RADIUS * Math.cos(angle);
        double yOfPointC = RADIUS * Math.sin(angle);
        System.out.printf("Point C coordinates: %f, %f%n", xOfPointC, yOfPointC);


    }

    private static double getRandomAngle() {
        return Math.random() * 2 * Math.PI;
    }

}
