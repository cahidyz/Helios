package lesson8.task.task4;

public class DeviceMain {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Laptop laptop = new Laptop();

        smartphone.charge();
        smartphone.connectToWiFi();

        System.out.println("____________________________");

        laptop.charge();
        laptop.connectToWiFi();
    }
}
