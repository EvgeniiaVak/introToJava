package chapter11.exercise16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wrongAnswers = new ArrayList<>();
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);

        System.out.printf("What is %d + %d? ", a, b);
        int answer = scanner.nextInt();

        while (answer != a + b) {
            System.out.println("Wrong answer!");
            if (wrongAnswers.contains(answer))
                System.out.println("You already tried " + answer);
            else
                wrongAnswers.add(answer);
            System.out.printf("Try again. What is %d + %d? ", a, b);
            answer = scanner.nextInt();
        }
        System.out.println("You've got it!");
    }
}
