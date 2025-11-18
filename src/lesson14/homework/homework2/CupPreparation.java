package lesson14.homework.homework2;

class CupPreparation extends Thread {
    @Override
    public void run() {
        System.out.println("Barista 3: Preparing cup..");
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Barista 3: Cup is ready on the table!");
    }
}