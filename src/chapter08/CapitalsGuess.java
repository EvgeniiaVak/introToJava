package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CapitalsGuess {

    private static String[][] states = {
            {"Alabama", "Montgomery"},
            {"Alaska",	"Juneau"},
            {"Arizona",	"Phoenix"},
            {"Arkansas",	"Little Rock"},
            {"California",	"Sacramento"},
            {"Colorado",	"Denver"},
            {"Connecticut",	"Hartford"},
            {"Delaware",	"Dover"},
            {"Florida",	"Tallahassee"},
            {"Georgia",	"Atlanta"},
            {"Hawaii",	"Honolulu"},
            {"Idaho",	"Boise"},
            {"Illinois",	"Springfield"},
            {"Indiana",	"Indianapolis"},
            {"Iowa",	"Des Moines"},
            {"Kansas",	"Topeka"},
            {"Kentucky",	"Frankfort"},
            {"Louisiana",	"Baton Rouge"},
            {"Maine",	"Augusta"},
            {"Maryland",	"Annapolis"},
            {"Massachusetts",	"Boston"},
            {"Michigan",	"Lansing"},
            {"Minnesota",	"Saint Paul"},
            {"Mississippi",	"Jackson"},
            {"Missouri",	"Jefferson City"},
            {"Montana",	"Helena"},
            {"Nebraska",	"Lincoln"},
            {"Nevada",	"Carson City"},
            {"New Hampshire",	"Concord"},
            {"New Jersey",	"Trenton"},
            {"New Mexico",	"Santa Fe"},
            {"New York",	"Albany"},
            {"North Carolina",	"Raleigh"},
            {"North Dakota",	"Bismarck"},
            {"Ohio",	"Columbus"},
            {"Oklahoma",	"Oklahoma City"},
            {"Oregon",	"Salem"},
            {"Pennsylvania",	"Harrisburg"},
            {"Rhode Island",	"Providence"},
            {"South Carolina",	"Columbia"},
            {"South Dakota",	"Pierre"},
            {"Tennessee",	"Nashville"},
            {"Texas",	"Austin"},
            {"Utah",	"Salt Lake City"},
            {"Vermont",	"Montpelier"},
            {"Virginia",	"Richmond"},
            {"Washington",	"Olympia"},
            {"West Virginia",	"Charleston"},
            {"Wisconsin",	"Madison"},
            {"Wyoming",	"Cheyenne"}
    };



    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/capitals.txt"));
        Scanner scanner = new Scanner(is);

        int correctCount = 0;
        for (int i = 0; i < states.length; i++) {
            int index = (int) (Math.random() * 50);
            System.out.printf("What is the capital of %s?%n", states[index][0]);
            String answer = scanner.nextLine().trim();
            if (answer.equalsIgnoreCase(states[index][1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.printf("The correct answer should be %s%n", states[index][1]);
            }
        }

        System.out.println("The correct count is " + correctCount);

        scanner.close();
        is.close();
    }
}
