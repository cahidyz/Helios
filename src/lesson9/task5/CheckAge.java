package lesson9.task5;

public class CheckAge {
    int age;
    public CheckAge(int age) {
        this.age = age;
    }
    void checkAge() {
        if (age < 18) {
            throw new AgeException("You are not allowed to enter");
        }
    }
}
