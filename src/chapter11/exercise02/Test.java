package chapter11.exercise02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Peter Person",
                "Temline St., 101, 24",
                "+7-973-999-33-05",
                "peterperson@gmail.com"));
        people.add(new Student("Don Student",
                "Domble St., 315, 442",
                "+7-973-013-43-02",
                "donstudent@gmail.com",
                Student.ClassStatus.FRESHMAN));
        people.add(new Employee("John Employee",
                "Potberry St., 942, 5",
                "+7-502-697-02-59",
                "johnemployee@gmail.com",
                345,
                10000));
        people.add(new Faculty("Norm Faculty",
                "Sonomore St., 321, 49",
                "+7-492-452-36-48",
                "normfaculty@gmail.com",
                30,
                10));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
