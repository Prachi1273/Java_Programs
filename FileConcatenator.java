import java.io.*;

public class FileConcatenator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileConcatenator output_file input_file1 input_file2 ...");
            return;
        }

        String outputFile = args[0];

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (int i = 1; i < args.length; i++) {
                String inputFile = args[i];
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File not found: " + inputFile);
                } catch (IOException e) {
                    System.out.println("Error reading file: " + inputFile);
                }
            }
            System.out.println("Files concatenated successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + outputFile);
        }
    }
}
