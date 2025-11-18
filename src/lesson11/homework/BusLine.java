package lesson11.homework;

import java.util.LinkedList;
import java.util.List;

public class BusLine {
    public static void main(String[] args) {

        System.out.println("This is the Bus Line for today!");

        LinkedList<String> busLine = new LinkedList<>();
        busLine.add("First Person");
        busLine.add("Second Person");
        busLine.add("Third Person");

        System.out.println("The Bus Line for today is " + busLine);

        busLine.addFirst("VIP Person"); // lists also start from zero
        System.out.println("The Bus Line for today is after some tweaks: " + busLine);

        busLine.removeLast();
        System.out.println("The Bus Line for today is after some tweaks: " + busLine);
    }
}
