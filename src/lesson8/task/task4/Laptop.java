package lesson8.task.task4;

public class Laptop extends Device implements Chargeable, Connectable {
    @Override
    public void charge() {
        System.out.println("Laptop charged");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Laptop connected to WiFi");
    }
}
