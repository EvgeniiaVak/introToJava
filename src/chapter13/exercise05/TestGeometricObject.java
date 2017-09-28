package chapter13.exercise05;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle = new Circle2D();
        GeometricObject triangle = new Triangle();

        System.out.println("area of circle is " + circle.getArea());
        System.out.println("area of triangle is " + triangle.getArea());

        System.out.println("the largest geometric object is " + GeometricObject.max(circle, triangle).getClass().getSimpleName());

        Triangle triangle1 = new Triangle(1, 1, 1);
        Triangle triangle2 = new Triangle(2, 2, 2);
        System.out.println("the largest triangle object is with area" + GeometricObject.max(triangle1, triangle2).getArea());

        Circle2D circle1 = new Circle2D(0, 0, 1);
        Circle2D circle2 = new Circle2D(0, 0, 2);
        System.out.println("the largest circle object is with area" + GeometricObject.max(circle1, circle2).getArea());
    }
}
