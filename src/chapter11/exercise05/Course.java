package chapter11.exercise05;

import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }
}
