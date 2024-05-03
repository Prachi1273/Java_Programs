import java.io.*;
import java.util.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReverseFileContent <file name>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            Collections.reverse(lines);

            for (String l : lines) {
                System.out.println(new StringBuilder(l).reverse().toString().toLowerCase());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
        }
    }
}

