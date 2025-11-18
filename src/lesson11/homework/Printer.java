package lesson11.homework;

import java.util.LinkedList;

public class Printer {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Geralt of Rivia");
        list.add("Nathan Drake");

        list.removeLast();

        for(String model : list){
            System.out.println(model);
        }
    }
}
