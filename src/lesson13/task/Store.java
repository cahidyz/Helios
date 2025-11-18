package lesson13.task;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 5);
        Product bread = new Product("Bread", 1);
        Product water = new Product("Water", 2);

        Map<Product, Integer> productCount = new HashMap<>();
        productCount.put(milk, 10);
        productCount.put(bread, 18);
        productCount.put(water, 12);

        for (Map.Entry<Product, Integer> entry : productCount.entrySet()) {
            System.out.println("Name: " + entry.getKey().getName() + ", price: " + entry.getKey().getPrice()+ "£, quantity: " +entry.getValue());
        }

    }
}
