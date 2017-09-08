package chapter11.exercise10;

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter five strings");

        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            stack.add(scanner.nextLine());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
