package lesson15.task;

public class Task4 {
    public static void main(String[] args) {
       String product = " Apple ";
       String productTrimmed = product.trim();
       String productTrimmedUp = productTrimmed.toUpperCase();
       System.out.println(productTrimmedUp);
       System.out.println(productTrimmed.length());
       System.out.println(productTrimmed.charAt(0));
       int productTrimmedLastChar =  productTrimmed.length() - 1;
       System.out.println(productTrimmed.charAt(productTrimmedLastChar));
    }
}
