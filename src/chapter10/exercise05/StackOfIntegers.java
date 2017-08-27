package chapter10.exercise05;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public int[] getElements() {
        int[] result = new int[size];
        System.arraycopy(elements, 0, result, 0, size);

        return result;
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(size);
        for (int i = size - 1; i >= 0; i--) {
            if (i != size - 1)
                result.append(", ");
            result.append(elements[i]);
        }
        return result.toString();
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
