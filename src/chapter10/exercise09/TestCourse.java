package chapter10.exercise09;

public class TestCourse {
    public static void main(String[] args) {
        Course physics = new Course("Physics");
        physics.addStudent("Sam");
        physics.addStudent("Tom");
        physics.addStudent("Mike");
        physics.addStudent("Stan");
        physics.addStudent("Ron");

        for (int i = 0; i < physics.getStudents().length; i++) {
            System.out.println(physics.getStudents()[i]);
        }

        physics.dropStudent("Sam");
        System.out.println("\n");

        for (int i = 0; i < physics.getStudents().length; i++) {
            System.out.println(physics.getStudents()[i]);
        }
    }
}
