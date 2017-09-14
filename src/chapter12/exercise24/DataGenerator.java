package chapter12.exercise24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class DataGenerator {

    public static void main(String[] args) throws IOException {
        File file = new File("src/chapter12/exercise24/data.txt");
        PrintWriter writer = new PrintWriter(file);
        Random random = new Random();

        for (int i = 1; i <= 1000; i++) {
            FacultyMember faculty = new FacultyMember(
                    "FirstName" + i,
                    "LastName" + i,
                    random);

            if (i == 1000) {
                writer.print(faculty);
            } else {
                writer.println(faculty);
            }

        }

        writer.close();
    }
}
