package lesson7.task1;

public class SmartSpeaker extends SmartDevice {

    public SmartSpeaker(String brand, String model, boolean isOnline) {
        super(brand, model, isOnline);
    }

    void playMusic(){
        System.out.println("Playing music");
    }

    @Override
    void connectToWifi(){
        System.out.println(brand + " " + model + " " + "Smart Speaker is connecting to wifi");
        isOnline = true;
    }

    @Override
    void disconnectFromWifi(){
        System.out.println("Smart Speaker is disconnecting from wifi");
        isOnline = false;
    }
}
