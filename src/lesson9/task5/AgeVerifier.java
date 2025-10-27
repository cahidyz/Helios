package lesson9.task5;

import java.util.Scanner;

public class AgeVerifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        CheckAge ca = new CheckAge(age);
        ca.checkAge();
    }
}
