package IX;

import java.io.*;

public class FileIODemo {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, File I/O in Java!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

