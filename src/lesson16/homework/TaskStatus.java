package lesson16.homework;

public enum TaskStatus {
    PENDING("Pending"),
    IN_PROGRESS("In Progress"),
    ON_HOLD("On Hold"),
    COMPLETED("Completed"),
    ARCHIVED("Archived");

    private final String description;

    // Constructor
    TaskStatus(String description) {
        this.description = description;
    }

    // Method to return description
    public String getDescription() {
        return description;
    }
}

