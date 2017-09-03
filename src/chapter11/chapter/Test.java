package chapter11.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        new Child();
//        new Child();
//        new Child();
//        new Child("some").methodToOverride();

//        new Child().methodToOverride();
//        new Child().anotherMethod();

        //Object[] objects = new int[50]; //- incompatible types

//        new Person().printPerson();
//        new Student().printPerson();

//        Parent parent = new Parent();
//        Child child = (Child) parent;


//        ArrayList<Double> list = new ArrayList<>();
//        list.add(1.0);
//
//
//        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
//        List<Integer> justList = Arrays.asList(array);
//        System.out.println(justList.size());
//        justList.set(0, 100000);
//        System.out.println(Arrays.toString(array));
//        List<Integer> listWithNewKeyWord = new ArrayList<>(Arrays.asList(array));
//
//        System.out.println();

//        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        new B();
    }
}

class A {
    int i = 7;

    public A() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A {
    public B() {
        // System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}

//class B {
//    public Object getValue() {
//        return "Any object";
//    }
//}
//
//class A extends B {
//    public String getValue() {
//        return "A string";
//    }
//}


class Student extends Person {

    private String getInfo() {
        return "Student";
    }
}
class Person {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {
        System.out.println(getInfo());
    }
}
