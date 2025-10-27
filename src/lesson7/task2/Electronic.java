package lesson7.task2;

public class Electronic extends Product{
    String brand;

    public Electronic(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price + ", Brand: " + brand);
    }
}
