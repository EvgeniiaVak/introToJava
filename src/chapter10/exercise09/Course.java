package chapter10.exercise09;

/*
* (The Course class) Revise the Course class as follows:
■ The array size is fixed in Listing 10.6. Improve it to automatically increase the
array size by creating a new larger array and copying the contents
of the current array to it.
■ Implement the dropStudent method.
■ Add a new method named clear() that removes all students from the
course.

Write a test program that creates a course, adds three students,
removes one, and displays the students in the course.
* */

import java.util.Arrays;

public class Course {
    private String title;
    private String[] students = new String[0];

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String[] getStudents() {
        return Arrays.copyOf(students, students.length);
    }

    public int getNumberOfStudents() {
        return students.length;
    }

    public void addStudent(String student) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                String[] temp = new String[students.length - 1];
                //copy first part of array
                System.arraycopy(students, 0, temp, 0, i);
                // omit i
                //copy second part of the array
                System.arraycopy(students, i + 1, temp, i, temp.length - i);
                students = temp;
            }
        }
    }

    public void clear() {
        students = new String[0];
    }
}
