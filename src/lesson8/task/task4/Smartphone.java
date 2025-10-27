package lesson8.task.task4;

public class Smartphone extends Device implements Chargeable, Connectable {
    @Override
    public void charge() {
        System.out.println("Smartphone charged");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("Smartphone connected to WiFi");
    }
}
