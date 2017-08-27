package chapter10.exercise10;

import java.util.Arrays;

public class Queue {
    private int[] elements = new int[8];
    private int size = 0;

    public Queue() {
    }

    public void enqueue(int v) {
        if (elements.length <= size) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int value = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        if (size < elements.length / 2) {
            elements = Arrays.copyOf(elements, elements.length / 2);
        }
        return value;
    }

    public int getSize() {
        return size;
    }
}
