package lesson8.task.task1;

public class Employee extends Person implements Trainable, Workable {
    @Override
    public void attendTraining() {
        System.out.println("Employee is attending training.");
    }

    @Override
    public void work() {
        System.out.println("Employee is working.");
    }
}
