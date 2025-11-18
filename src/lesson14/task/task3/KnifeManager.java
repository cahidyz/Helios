package lesson14.task.task3;

public class KnifeManager {
    public static void main(String[] args) {
        Object sharedKnife = new Object();

        Thread cook1 = new Thread(new Knife("Cook 1", sharedKnife));
        Thread cook2 = new Thread(new Knife("Cook 2", sharedKnife));
        Thread cook3 = new Thread(new Knife("Cook 3", sharedKnife));

        cook1.start();
        cook2.start();
        cook3.start();
    }
}
