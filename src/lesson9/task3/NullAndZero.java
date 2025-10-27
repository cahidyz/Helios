package lesson9.task3;

import java.util.InputMismatchException;

public class NullAndZero {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        try{
            int a = 5;
            int b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
