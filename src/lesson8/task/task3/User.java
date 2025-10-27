package lesson8.task.task3;

public abstract class User {
    int id;
    String name;

    void getDetails() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
}
