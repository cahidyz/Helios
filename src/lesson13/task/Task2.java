package lesson13.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("Jacob", "q1w2e3");
        users.put("Joel", "54326");
        users.put("Tom", "Lq134");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = input.nextLine();
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        users.put(name, password);

        if(users.containsKey(name)){
            users.get(name).equals(password);
            System.out.println("Entry is successful.");
        }else {
            System.out.println("Entry is failed.");
        }
        input.close();

    }
}
