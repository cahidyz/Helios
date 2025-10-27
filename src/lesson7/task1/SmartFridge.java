package lesson7.task1;

public class SmartFridge extends SmartDevice{
    int coolingLevel;

    public SmartFridge(String brand, String model, boolean isOnline, int coolingLevel) {
        super(brand, model, isOnline);
        this.coolingLevel = coolingLevel;
    }

    void showTemperature(){
        System.out.println("Current cooling level is: " + coolingLevel);
    }

    @Override
    void connectToWifi() {
        System.out.println(brand + " " + model + " " + "Smart Fridge is connecting to wifi");
        isOnline = true;
    }

    @Override
    void disconnectFromWifi() {
        System.out.println("Smart Fridge is disconnecting from wifi");
        isOnline = false;
    }
}
