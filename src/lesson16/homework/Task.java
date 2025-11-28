package lesson16.homework;

public class Task {
    private Integer taskId;
    private Double estimatedHours;
    private TaskStatus status;
    private Urgency urgency;
    private Boolean isCritical;

    // Constructor accepting all fields
    public Task(Integer taskId, Double estimatedHours, TaskStatus status, Urgency urgency, Boolean isCritical) {
        this.taskId = taskId;
        this.estimatedHours = estimatedHours;
        this.status = status;
        this.urgency = urgency;
        this.isCritical = isCritical;
    }

    // Method to update status with specific behavior
    public void updateStatus(TaskStatus newStatus) {
        this.status = newStatus;

        // Switch statement to handle logic based on the new status
        System.out.println("--- Status Update Log ---");
        switch (newStatus) {
            case IN_PROGRESS:
                System.out.println("Alert: Task started. Time tracking is active.");
                break;
            case COMPLETED:
                System.out.println("Success: Task finished! Awaiting manager review.");
                break;
            case ARCHIVED:
                System.out.println("Info: Task has been moved to the archive.");
                break;
            default:
                System.out.println("Status updated to: " + newStatus.getDescription());
        }
    }

    // Method to mark task as critical
    public void setCritical(Boolean critical) {
        isCritical = critical;
    }

    // Getters
    public Integer getTaskId() {
        return taskId;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Hours: %.1f | Status: %s (%s) | Priority: %s | Critical: %s",
                taskId, estimatedHours, status, status.getDescription(), urgency, (isCritical ? "YES" : "No"));
    }
}
