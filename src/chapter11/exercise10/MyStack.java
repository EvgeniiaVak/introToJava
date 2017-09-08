package chapter11.exercise10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public Object peek() {
        return get(size() - 1);
    }

    public Object pop() {
        Object o = peek();
        remove(size() -1);
        return o;
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
