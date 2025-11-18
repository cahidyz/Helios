package lesson14.homework.homework2;

public class BaristaMain {
    public static void main(String[] args) {
        MilkPreparation milkThread = new MilkPreparation();
        CoffeeShotPreparation coffeeThread = new CoffeeShotPreparation();
        CupPreparation cupThread = new CupPreparation();

        System.out.println("Order received: Latte ");


        milkThread.start();
        coffeeThread.start();
        cupThread.start();

        // main thread will wait for them to finish
        try {
            milkThread.join();
            coffeeThread.join();
            cupThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Latte is ready! Enjoy.");
    }
}
