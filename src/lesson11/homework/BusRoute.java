package lesson11.homework;

import java.util.LinkedList;

public class BusRoute {
    public static void main(String[] args) {
        LinkedList<String> busRoutes = new LinkedList<>();
        busRoutes.add("Sevilla");
        busRoutes.add("Madrid");
        busRoutes.add("Barcelona");
        busRoutes.add(2, "San Francisco");
        busRoutes.remove(2);
        for (String busRoute : busRoutes) {
            System.out.println(busRoute);
        }
    }
}
