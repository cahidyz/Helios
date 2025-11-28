package lesson15.homework;

public class StringTask implements Runnable {
    // Shared resources
    private StringBuilder sb;
    private StringBuffer sbf;
    private String charToAdd;

    // Constructor to receive the shared objects
    public StringTask(StringBuilder sb, StringBuffer sbf, String charToAdd) {
        this.sb = sb;
        this.sbf = sbf;
        this.charToAdd = charToAdd;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            // Unsafe operation
            sb.append(charToAdd);
            // Safe operation
            sbf.append(charToAdd);
        }
    }
}