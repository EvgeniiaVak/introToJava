package chapter10.exercise24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class MyCharacter {
    char c;

    public MyCharacter() {
        this('\u0000');
    }

    public MyCharacter(char c) {
        this.c = c;
    }

    public char charValue() {
        return c;
    }

    public int compareTo(MyCharacter other) {
        if (c < other.c)
            return -1;
        else if (c > other.c)
            return 1;
        else
            return 0;
    }

    public boolean equals(MyCharacter other) {
        return c == other.c;
    }

    public static MyCharacter toUpperCase(MyCharacter myCharacter) {
        return new MyCharacter(Character.toUpperCase(myCharacter.c));
    }

    public static MyCharacter toLowerCase(MyCharacter myCharacter) {
        return new MyCharacter(Character.toLowerCase(myCharacter.c));
    }

    public static int getNumericValue(MyCharacter myCharacter) {
        return (int) myCharacter.c;
    }

    public static MyCharacter valueOf(char c) {
        return new MyCharacter(c);
    }

    public static boolean isDigit(MyCharacter myCharacter) {
        return Character.isDigit(myCharacter.c);
    }

    public static boolean isLetterOrDigit(MyCharacter myCharacter) {
        return Character.isLetterOrDigit(myCharacter.c);
    }

    public static boolean isLetter(MyCharacter myCharacter) {
        return Character.isLetter(myCharacter.c);
    }

    public static boolean isSpaceChar(MyCharacter myCharacter) {
        return Character.isSpaceChar(myCharacter.c);
    }
}
