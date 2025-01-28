package IX;

import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Reading from input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                // Writing to the output file
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("File content copied from input.txt to output.txt successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

