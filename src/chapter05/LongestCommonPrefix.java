package chapter05;

/*
* (Longest common prefix) Write a program that prompts the user to enter two strings
* and displays the largest common prefix of the two strings.
* */

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String line1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String line2 = scanner.nextLine();

        int shortest = (line1.length() <= line2.length()) ? line1.length() : line2.length();

        String prefix = "";
        for (int i = 0; i < shortest; i++) {
            if (line1.charAt(i) == line2.charAt(i))
                prefix += line1.charAt(i);
            else
                break;
        }
        if (prefix.isEmpty()) {
            System.out.println("no common prefix");
        } else {
            System.out.println("The common prefix is: " + prefix);
        }


    }
}
