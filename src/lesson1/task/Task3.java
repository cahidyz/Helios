package lesson1.task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many cups of coffee consumed each day?");
        int cupsConsumed = input.nextInt();
        System.out.println("What is the cost of cup?");
        double cupCost= input.nextDouble();
        double totalCost = cupCost * (cupsConsumed*30);
        System.out.println("Total cost: " + totalCost);
        int consumedPerPerson = cupsConsumed / 5;
        System.out.println("Number of cups per employee each day: " + consumedPerPerson);
    }
}
