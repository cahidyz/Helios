package lesson16.homework;

public enum Urgency {
    ROUTINE("Daily Routine Task"),
    NORMAL("Standard Priority"),
    URGENT("Immediate Action Required");

    private final String description;

    Urgency(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
