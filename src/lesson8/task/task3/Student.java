package lesson8.task.task3;

public class Student extends User implements ExamParticipant {
    @Override
    public void takeExam() {
        System.out.println("Student is taking exam.");
    }
}
