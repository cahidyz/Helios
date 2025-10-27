package lesson7.task2;

public class ProductMain {
    public static void main(String[] args) {
        Book book = new Book("Java 101", 25, "James Gosling");
        book.applyDiscount(25);
        book.displayInfo();
    }
}
