package lesson7.task1;

public class SmartWatch extends SmartDevice {
    int trackHeartRate;

    public SmartWatch(String brand, String model, boolean isOnline, int trackHeartRate) {
        super(brand, model, isOnline);
        this.trackHeartRate = trackHeartRate;
    }

    void heartBeat(){
        System.out.println("Smart watch tracked your heart beat: " + trackHeartRate);
    }

    @Override
    void connectToWifi(){
        System.out.println(brand + " " + model + " " + "Smart Watch is connecting to wifi");
        isOnline = true;
    }

    @Override
    void disconnectFromWifi(){
        System.out.println("Smart Watch is disconnecting from wifi");
        isOnline = false;
    }
}
