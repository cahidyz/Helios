package lesson10.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleIO {
    public static void main(String[] args) {
        File directory = new File("src/lesson10/task2");

        if (!directory.exists()) {
            directory.mkdirs();
            System.out.println("Directory is created: " + directory.getAbsolutePath());
        }

        File file = new File(directory, "story.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File is created at: " + file.getAbsolutePath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write("This is a test. #1 \n");
                fileWriter.write("This is a test. #2 \n");
                fileWriter.write("This is a test. #3 \n");
                System.out.println("File writing completed successfully.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (FileReader fileReader = new FileReader(file)) {
            int c;
            StringBuilder line = new StringBuilder();

            while ((c = fileReader.read()) != -1) { // read all characters
                if ((char) c == '\n') {             // detect line break
                    System.out.println(line.toString());
                    line.setLength(0);               // reset for next line
                } else if ((char) c != '\r') {      // ignore '\r' on Windows
                    line.append((char) c);
                }
            }

            // print the last line if file does not end with '\n'
            if (line.length() > 0) {
                System.out.println(line.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
