package chapter12.exercise12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CodeReformer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: java TextRemover <file to reform>");
            System.exit(1);
        }

        try {
            File sourceFile = new File(args[0]);
            Scanner scanner = new Scanner(sourceFile);

            ArrayList<String> lines = new ArrayList<>();

            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                if (line.trim().startsWith("{")) {
                    int index = lines.size() - 1;
                    String temp = lines.get(index);
                    lines.set(index, temp + " " + line.trim());
                } else {
                    lines.add(line);
                }
            }

            PrintWriter writer = new PrintWriter(sourceFile);
            for (String line :
                    lines) {
                System.out.println(line);
                writer.println(line);
            }

            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file found: " + args[0]);
        }
    }
}
