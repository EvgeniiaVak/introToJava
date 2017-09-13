package chapter12.exercise22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MultipleStringReplacer {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java MultipleStringReplacer <dir path> <original word> <new word>");
            System.exit(1);
        }

        String path = args[0];
        String original = args[1];
        String changed = args[2];

        try {
            File dir = new File(path);
            File[] files = dir.listFiles();
            if (files.length == 0) {
                System.out.println("no files in the directory");
                System.exit(1);
            }

            for (File file :
                    files) {
                Scanner scanner = new Scanner(file);

                StringBuilder builder = new StringBuilder();
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    builder.append(line.replaceAll(original, changed));
                    if (scanner.hasNext())
                        builder.append("\n");
                }

                PrintWriter writer = new PrintWriter(file);

                System.out.println(builder.toString());
                writer.write(builder.toString());

                writer.close();
                scanner.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("no such directory " + path);
            e.printStackTrace();
        }
    }
}
