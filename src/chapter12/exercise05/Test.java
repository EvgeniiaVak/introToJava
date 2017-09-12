package chapter12.exercise05;

public class Test {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(1, 1, 2);
            System.out.println("successfully created triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
