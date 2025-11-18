package lesson14.homework.homework2;

class MilkPreparation extends Thread {
    @Override
    public void run() {
        System.out.println("Barista 1: Getting milk ready..");
        try {
            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Barista 1: Milk is ready!");
    }
}