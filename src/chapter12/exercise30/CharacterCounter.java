package chapter12.exercise30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("enter a file name");
        //src/chapter12/exercise30/Lincoln.txt
        String pathName = userInputScanner.next();

        File file = new File(pathName);
        Scanner fileScanner = new Scanner(file);
        StringBuilder dataBuilder = new StringBuilder();
        while (fileScanner.hasNext()) {
            dataBuilder.append(fileScanner.nextLine());
        }
        System.out.println(dataBuilder);
        char[] data = dataBuilder.toString().toUpperCase().toCharArray();
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        int[] counts = new int[26];

        for (char letter : data) {
            for (int i = 0; i < alphabet.length; i++) {
                if (letter == alphabet[i])
                    counts[i]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.printf("Number of %c's: %d%n", alphabet[i], counts[i]);
        }
    }
}
