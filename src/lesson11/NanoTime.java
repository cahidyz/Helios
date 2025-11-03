package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NanoTime {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10000 ; i++) {
            arrayList.add(0,i);
        }
        long startTimeArray = System.nanoTime();
        System.out.println("Get me: " + arrayList.get(1050));
        long endTimeArray = System.nanoTime();
        long totalTimeArray = endTimeArray - startTimeArray;
        System.out.println("Total time is " + totalTimeArray);

        for (int i = 0; i < 10000 ; i++) {
            linkedList.add(0,i);
        }
        long startTimeLinked = System.nanoTime();
        System.out.println("Get me: " + linkedList.get(1050));
        long endTimeLinked = System.nanoTime();
        long totalTimeLinked = endTimeLinked - startTimeLinked;
        System.out.println("Total time is " + totalTimeLinked);

    }
}
