package lesson1.homework;

import java.util.Scanner;

public class TastyCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sweetness of banana(ml): ");
        double sweet1 = input.nextDouble();
        System.out.println("Enter sweetness for cactus(ml): ");
        double sweet2 = input.nextDouble();
        double totalSweet = sweet1 + sweet2;
        double totalCup = (sweet1 + sweet2) / 250;
        System.out.println("Total sweetness is: " + totalSweet + " and it makes " + totalCup + " cups.");

    }
}
