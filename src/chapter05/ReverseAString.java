package chapter05;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.next();

        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
