package lesson14.homework.homework1;

public class CustomerOrder implements Runnable {
    String customerName;
    String drink;

    public CustomerOrder(String customerName, String drink) {
        this.customerName = customerName;
        this.drink = drink;
    }

    @Override
    public void run() {
        System.out.println(drink + " is getting brewed..");
        try {
            Thread.sleep(3000);
            System.out.println(drink + " is ready.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
