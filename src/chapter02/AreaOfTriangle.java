package chapter02;

/*
* (Geometry: area of a triangle) Write a program that prompts the user to enter three points
* (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
* The formula for computing the area of a triangle is
* s = (side1 + side2 + side3) / 2;
* area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
* */

public class AreaOfTriangle {
    private double side1, side2, side3;

    public static void main(String[] args) {

        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        areaOfTriangle.assignSidesFromPoints(1.5, -3.4, 4.6, 5, 9.5, -3.4);
        System.out.println(areaOfTriangle.getAreaOfTriangle());

    }

    public void assignSidesFromPoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        side1 = DistanceOfTwoPoints.getDistanceOfTwoPoints(x1, y1, x2, y2);
        side2 = DistanceOfTwoPoints.getDistanceOfTwoPoints(x2, y2, x3, y3);
        side3 = DistanceOfTwoPoints.getDistanceOfTwoPoints(x3, y3, x1, y1);
    }

    public double getAreaOfTriangle() {

        return getAreaOfTriangle(side1, side2, side3);
    }

    public double getAreaOfTriangle(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
