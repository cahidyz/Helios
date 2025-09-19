package lesson1.task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 1:");
        System.out.println("Please decide the price of ice cream.");
        System.out.println("Price of first scoop: ");
        double scoop1 = input.nextDouble();
        System.out.println("Price of second scoop: ");
        double scoop2 = input.nextDouble();
        double totalPrice = scoop1 + scoop2;
        System.out.println("Total price of two scoops: " + totalPrice);
        double reminder = scoop1 % scoop2;
        System.out.println("Reminder: " + reminder);
    }
}
