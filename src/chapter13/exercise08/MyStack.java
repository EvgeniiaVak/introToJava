package chapter13.exercise08;

//(Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to perform a deep copy of the list field.

import java.util.ArrayList;
import java.util.List;

public class MyStack implements Cloneable {
    private ArrayList list;

    public MyStack() {
        list = new ArrayList();
    }

    public MyStack(List list) {
        this.list = new ArrayList(list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push (Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    protected MyStack clone() throws CloneNotSupportedException {
        return new MyStack(list);
    }
}