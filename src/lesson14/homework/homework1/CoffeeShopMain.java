package lesson14.homework.homework1;

public class CoffeeShopMain {
    public static void main(String[] args) {
        Thread customerLine = new Thread(new CustomerOrder("Jason", "Latte"));
        customerLine.start();
    }
}
