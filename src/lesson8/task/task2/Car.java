package lesson8.task.task2;

public class Car extends Vehicle implements Fuelable, Movable {
    @Override
    public void fuel() {
        System.out.println("My car's fuel is petrol.");
    }
    @Override
    public void move() {
        System.out.println("My car's moves very fast.");
    }
}
