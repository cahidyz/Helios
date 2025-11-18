package lesson11.task;

import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        System.out.println("Football Team");
        System.out.println("-------------");
        List<String> arrayList = new java.util.ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Current list of players: " + arrayList + " #1");

        arrayList.remove(2);
        arrayList.remove(3);
        System.out.println("Current list of players: " + arrayList + " #2");

        System.out.println("-------------");

        System.out.println("Restaurant");
        System.out.println("-------------");

        List<String> arrayRestaurantList = new java.util.ArrayList<>();
        arrayRestaurantList.add("A");
        arrayRestaurantList.add("B");
        arrayRestaurantList.add("C");

        System.out.println("Current list of meals: " + arrayRestaurantList + " #1");
        arrayRestaurantList.add("D");

        System.out.println("Current list of meals: " + arrayRestaurantList + " #2");

        System.out.println("-------------");

        System.out.println("Book Search");
        System.out.println("-------------");

        List<String> arrayBookSearchList = new java.util.ArrayList<>();
        arrayBookSearchList.add("A");
        arrayBookSearchList.add("B");
        arrayBookSearchList.add("C");

        System.out.print("Which book you are looking for? ");
        Scanner scanner = new Scanner(System.in);
        String bookSearch = scanner.nextLine();
        if (arrayBookSearchList.contains(bookSearch)) {
            System.out.println("Book Found");
        }  else {
            System.out.println("Book Not Found");
        }

        System.out.println("-------------");

        System.out.println("Gym Equipments");
        System.out.println("-------------");

        List<Integer> arrayGymEquipmentsList = new java.util.ArrayList<>();
        arrayGymEquipmentsList.add(1);
        arrayGymEquipmentsList.add(2);
        arrayGymEquipmentsList.add(5);
        arrayGymEquipmentsList.add(10);
        arrayGymEquipmentsList.add(20);

        for (int i = 0; i < arrayGymEquipmentsList.size(); i++) {
            if(5 <= arrayGymEquipmentsList.get(i)) {
                System.out.println("Here is weight: " + arrayGymEquipmentsList.get(i));
            }
        }
    }
}
