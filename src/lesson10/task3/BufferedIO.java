package lesson10.task3;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class BufferedIO {
    public static void main(String[] args) {
        File file = new File("src/lesson10/task3/buffered_text.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("First line.");
            writer.newLine();
            writer.write("Second line.");
            writer.newLine();
            writer.write("Third line.");
            writer.newLine();
            writer.write("Fourth line.");
            writer.newLine();
            writer.write("Fifth line.");
            writer.newLine();
            System.out.println("Writing to file is done.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error occurred while reading: " + e.getMessage());
        }
    }
}
