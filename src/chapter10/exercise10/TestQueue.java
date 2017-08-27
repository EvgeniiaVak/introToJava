package chapter10.exercise10;

import java.util.Random;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Random random = new Random(2);
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(10);
            queue.enqueue(value);
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println(queue.getSize());
        System.out.println();

        int size = queue.getSize();
        for (int i = 0; i < size; i++) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
        System.out.println(queue.getSize());

    }
}
