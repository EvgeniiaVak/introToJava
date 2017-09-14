package chapter12.exercise23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ScoreReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner scanner = new Scanner(url.openStream());

            int total = 0;
            int average = 0;
            int counter = 0;

            while (scanner.hasNext()) {
                String string = scanner.next();

                if (string.matches("(\\d)+")) {
                    total += Integer.parseInt(string);
                    counter++;
                }
            }

            System.out.println("Total is " + total);
            System.out.println("Average is " + ((double) total / counter));


        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
