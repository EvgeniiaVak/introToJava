package chapter13.exercise05;


/*
* (Geometry: the Circle2D class) Define the Circle2D class that contains:
■ Two double data fields named x and y that specify the center of the circle with getter methods.
■ A data field radius with a getter method.
■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
■ A constructor that creates a circle with the specified x, y, and radius.
■ A method getArea() that returns the area of the circle.
■ A method getPerimeter() that returns the perimeter of the circle.
■ A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
■ A method contains(Circle2D circle) that returns true if the speci-
fied circle is inside this circle (see Figure 10.21b).
■ A method overlaps(Circle2D circle) that returns true if the speci-
fied circle overlaps with this circle (see Figure 10.21c).
* */

import chapter02.DistanceOfTwoPoints;

public class Circle2D extends GeometricObject {
    private double x, y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = DistanceOfTwoPoints.getDistanceOfTwoPoints(
                x, y, circle.x, circle.y
        );

        return distance <= radius + circle.radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = DistanceOfTwoPoints.getDistanceOfTwoPoints(
                x, y, circle.x, circle.y
        );

        return distance <= radius - circle.radius;
    }

    public boolean contains(double x, double y) {
        double distance = DistanceOfTwoPoints.getDistanceOfTwoPoints(
                this.x, this.y, x, y
        );

        return distance < radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
