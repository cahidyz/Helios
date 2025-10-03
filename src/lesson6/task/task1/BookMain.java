package lesson6.task.task1;

public class BookMain {
    public static void main(String[] args) {
        Book bookJava = new Book("Java 101", "Someone", 250);
        System.out.println("Book: " + bookJava.getName() + ", " + bookJava.getAuthor() + ", " + bookJava.getPageCount());
        bookJava.setAuthor("James Gosling");
        bookJava.setPageCount(500);
        System.out.println("Updated book: " + bookJava.getName() + ", " +  bookJava.getAuthor() + ", " + bookJava.getPageCount());
    }
}
