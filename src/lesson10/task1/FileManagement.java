package lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file's name: ");
        String fileName = input.nextLine();

        // Create file inside the lesson10 folder
        File directory = new File("src/lesson10/task1");
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file = new File(directory, fileName); // file will be created inside lesson10/

        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File does not exist, so it's created.");
                    System.out.println("File created at: " + file.getAbsolutePath());
                } else {
                    System.out.println("File could not be created");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("File already exists at: " + file.getAbsolutePath());
        }

        input.close();
    }
}
