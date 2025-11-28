package lesson16.task;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();

        prices.add(15.5);
        prices.add(22.5);
        prices.add(5.8);

        double sum = 0;

        for (Double price : prices) {
            sum += price;
        }

        System.out.println("Total Sum: " + sum);
    }
}
