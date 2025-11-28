package lesson15.homework;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer();

        StringTask task1 = new StringTask(sb, sbf, "A");
        StringTask task2 = new StringTask(sb, sbf, "B");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("FINAL RESULTS");
        System.out.println("Expected Length: 2000");
        System.out.println("StringBuffer (ThreadSafe): " + sbf.length());
        System.out.println("StringBuilder (Unsafe): " + sb.length());
    }
}