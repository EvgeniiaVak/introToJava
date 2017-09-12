package chapter12.exercise19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlTextWordCounter {

    public static void main(String[] args) {
        try {
            int numberOfWords = count("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            System.out.println("number of words is " + numberOfWords);
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int count(String address) throws MalformedURLException, IOException {
        int result = 0;

        URL url = new URL(address);
        Scanner scanner = new Scanner(url.openStream());

        while (scanner.hasNext()) {
            String word = scanner.next();
            boolean hasLetters = false;

            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i))) {
                    hasLetters = true;
                    break;
                }
            }

            if (hasLetters)
                result++;
        }

        return result;
    }
}
