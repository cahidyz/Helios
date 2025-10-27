package lesson7.task1;

public class SmartMain {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch("Apple", "Watch", false, 150);
        SmartSpeaker ss = new SmartSpeaker("LG", "SuperSpeaker", false);
        SmartFridge sf = new SmartFridge("Hitachi", "İceFridge", false, 250);

        sw.connectToWifi();
        ss.connectToWifi();
        sf.connectToWifi();

    }
}
