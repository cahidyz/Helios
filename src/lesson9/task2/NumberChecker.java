package lesson9.task2;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        try {
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }
    }
}
