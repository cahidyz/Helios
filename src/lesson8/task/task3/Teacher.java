package lesson8.task.task3;

public class Teacher extends User implements ExamParticipant, Payable {
    @Override
    public void takeExam() {
        System.out.println("Teacher is watching exam.");
    }

    @Override
    public void receiveSalary() {
        System.out.println("Teacher receives salary.");
    }
}
