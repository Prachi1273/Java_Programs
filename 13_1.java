import java.io.*;
import java.util.*;

public class FileWordCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileWordCount <file name>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        int wordCount = 0;
        int lineCount = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                lineCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            return;
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}

