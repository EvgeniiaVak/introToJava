package chapter05;

/*
* (Display the ASCII character table) Write a program that prints the characters in the ASCII
* character table from ! to ~. Display ten characters per line. The ASCII table is
* shown in Appendix B. Characters are separated by exactly one space.
* */

public class CharacterTable {
    public static void main(String[] args) {
        for (int i = '!'; i < '~' + 1; i++) {
            System.out.print((char) i + " ");
            if (((i - '!' + 1) % 10) == 0) System.out.println();

        }
    }
}
