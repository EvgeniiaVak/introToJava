package chapter12.exercise25;

import chapter12.exercise24.FacultyMember;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class SalaryReader {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
        Scanner scanner = new Scanner(url.openStream());

        double totalAssistant = .0; int numOfAssistants = 0;
        double totalAssociate = .0; int numOfAssociates = 0;
        double totalFull = .0;      int numOfFull = 0;

        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split("\\s");
            String title = line[2];
            Double salary = Double.parseDouble(line[3]);

            switch (title) {
                case "assistant":
                    totalAssistant += salary;
                    numOfAssistants++;
                    break;
                case "associate":
                    totalAssociate += salary;
                    numOfAssociates++;
                    break;
                case "full":
                    totalFull += salary;
                    numOfFull++;
                    break;
            }
        }

        System.out.printf("total assistant pay is %.2f, average assistant pay is %.2f%n",
                totalAssistant, totalAssistant/numOfAssistants);
        System.out.printf("total associate pay is %.2f, average associate pay is %.2f%n",
                totalAssociate, totalAssociate/numOfAssociates);
        System.out.printf("total full pay is %.2f, average full pay is %.2f%n",
                totalFull, totalFull/numOfFull);

    }
}
