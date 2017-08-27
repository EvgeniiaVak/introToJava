package chapter02;

/**
 * Created by evgeniyavakarina on 7/18/17.
 *
 * (Random character) Write a program that displays a random uppercase letter
 * using the System.CurrentTimeMillis() method.
 */
public class RandomCharacter {

    public static void main(String[] args) {
        char a = 'A';
        char b = (char) (a + (System.currentTimeMillis() % ('A' - 'Z' + 1)));
        System.out.print(b);

    }
}
