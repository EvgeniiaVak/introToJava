package chapter11.exercise06;

import chapter09.exercise_07.Account;
import chapter10.exercise11.Circle2D;
import chapter10.exercise14.MyDate;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add(new Account());
        objects.add(new MyDate());
        objects.add(new String("My string"));
        objects.add(new Circle2D());

        for (Object object :
                objects) {
            System.out.println(object);
        }
    }
}
