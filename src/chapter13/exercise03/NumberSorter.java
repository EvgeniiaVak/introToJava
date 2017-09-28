package chapter13.exercise03;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumberSorter {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(4.5);
        numbers.add(1.5);
        numbers.add(0);
        numbers.add(39.234f);
        numbers.add(-5);
        numbers.add(BigInteger.ONE);

        System.out.println(numbers);

        sort(numbers);

        System.out.println(numbers);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            List<Number> numbersLeft = list.subList(i, list.size());
            int indexOfNextMinElement = findMinElementIndex(numbersLeft);
            swapElements(list, i, indexOfNextMinElement + i);
        }
    }

    /** Looks through an array list of numbers, compares their double values,
     * finds the smallest and returns it's index.
     * If the argument is null or if it is an empty list returns -1.*/
    public static int findMinElementIndex(List<Number> list) {
        if (list == null || list.size() == 0)
            return -1;

        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(minIndex).doubleValue() > list.get(i).doubleValue()) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swapElements (List list, int a, int b) {
        if (a < 0 || a >= list.size() || b < 0 || b >= list.size()) {
            System.out.println("Invalid input in swapElements()");
            return;
        }

        Object temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}