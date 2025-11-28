package lesson15.task;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder listDelete = new StringBuilder();
        listDelete.append("Bread, Milk, Egg, Applele");
        listDelete.delete(listDelete.length() - 2, listDelete.length());
        listDelete.delete(0, 7);
        System.out.println(listDelete.toString());
    }
}
