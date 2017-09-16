package chapter12.exerise33;

/*(Search Web) Modify Listing 12.18 WebCrawler.java to search for the word Computer
Programming starting from the URL http://cs.armstrong.edu/liang. Your program terminates once
the word is found. Display the URL for the page that contains the word.*/

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {
    public static final String WORD = "Computer Programming";

    public static void main(String[] args) {
        String startingUrlString = "http://cs.armstrong.edu/liang";
        ArrayList<String> listOfPendingUrls = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingUrls.add(startingUrlString);

        while (!listOfPendingUrls.isEmpty()) {
            String urlString = listOfPendingUrls.remove(0);

            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("craw: " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingUrls.add(s);
                }
            }
        }
    }

    private static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner scanner = new Scanner(url.openStream());
            int current = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                //the exercise itself:
                if (line.contains(WORD)) {
                    System.out.println("Found " + WORD + " on page " + urlString);
                    System.exit(0);
                }
                //end

                current = line.indexOf("http:", current);

                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);

                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());;
        }

        return list;
    }


}
