package lesson1.task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 2: ");
        System.out.println("Enter the price of 3 products");
        System.out.println("Price of first product: ");
        double firstProduct = input.nextInt();
        System.out.println("Price of second product: ");
        double secondProduct = input.nextInt();
        System.out.println("Price of third product: ");
        double thirdProduct = input.nextInt();
        double totalPriceProducts = firstProduct + secondProduct + thirdProduct;
        System.out.println("Total price of products: " + totalPriceProducts);
        double averagePriceProduct = totalPriceProducts/3;
        System.out.println("Average price of products: " + averagePriceProduct);
        double productOfProducts = firstProduct * secondProduct * thirdProduct;
        System.out.println("Product of products: " + productOfProducts);
    }
}
