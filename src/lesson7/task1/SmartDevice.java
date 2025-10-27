package lesson7.task1;

public class SmartDevice {
    protected String brand;
    protected String model;
    protected boolean isOnline;

    public SmartDevice(String brand, String model, boolean isOnline) {
        this.brand = brand;
        this.model = model;
        this.isOnline = isOnline;
    }

    void connectToWifi(){
        System.out.println("Device is connected to wifi");
    }

    void disconnectFromWifi(){
        System.out.println("Device is disconnected from wifi");
    }

}
