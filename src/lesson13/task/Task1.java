package lesson13.task;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Jacob", 100);
        students.put("Joel", 55);
        students.put("Tom", 70);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
