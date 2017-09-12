package chapter12.exercise16;

import javax.sound.midi.SoundbankResource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextReplacer {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: java TextReplacer <file path> <original word> <new word>");
            System.exit(1);
        }

        String path = args[0];
        String original = args[1];
        String changed = args[2];

        try {
            File file = new File(path);
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
        } catch (FileNotFoundException e) {
            System.out.println("no such file " + path);
            e.printStackTrace();
        }
    }
}
