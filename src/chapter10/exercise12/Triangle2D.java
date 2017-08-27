package chapter10.exercise12;

import chapter10.exercise04.MyPoint;

public class Triangle2D {
    private MyPoint[] points = new MyPoint[3];



    public Triangle2D() {
        this(
                new MyPoint(0, 0),
                new MyPoint(1, 1),
                new MyPoint(2, 5)
        );
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
    }

    //returns true if the specified triangle overlaps with this triangle
    public boolean overlaps(Triangle2D t) {
        // TODO: 8/22/17
        return true;
    }

    //returns true if the specified triangle is inside this triangle
    public boolean contains(Triangle2D t) {
        // TODO: 8/22/17
        return true;
    }

    //returns true if the specified point p is inside this triangle
    public boolean contains(MyPoint p) {
        //check every line of the triangle
        Line2D[] lines = new Line2D[3];
        lines[0] = new Line2D(getPointA(), getPointB());
        lines[1] = new Line2D(getPointB(), getPointC());
        lines[2] = new Line2D(getPointC(), getPointA());



        //find the rightmost point

        //among other 2 points which is higher

        //if point is to the right of this line - its outside - return false
        // TODO: 8/24/17 fix 


        //if the point is to the other side return false


        return true;
    }

    public double getPerimeter() {
        return getLengthAB() + getLengthBC() + getLengthCA();
    }

    public double getArea() {

        double s = (getPerimeter()) / 2;
        return Math.sqrt(s * (s - getLengthAB()) * (s - getLengthBC()) * (s - getLengthCA()));
    }

    public double getLengthAB() {
        return getPointA().distance(getPointB());
    }

    public double getLengthBC() {
        return getPointB().distance(getPointC());
    }

    public double getLengthCA() {
        return getPointC().distance(getPointA());
    }

    public MyPoint getPointA() {
        return points[0];
    }

    public void setPointA(MyPoint pointA) {
        points[0] = pointA;
    }

    public MyPoint getPointB() {
        return points[1];
    }

    public void setP2(MyPoint pointB) {
        points[1] = pointB;
    }

    public MyPoint getPointC() {
        return points[2];
    }

    public void setPointC(MyPoint pointC) {
        points[2] = pointC;
    }
}
