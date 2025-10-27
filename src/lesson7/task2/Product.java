package lesson7.task2;

public abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void applyDiscount(double price){
        this.price = this.price * 0.75;
        System.out.println("Discount applied to " + name + " and price dropped to " + this.price);
    }

    public abstract void displayInfo();


}
