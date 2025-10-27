package lesson8.task.task3;

public class UserMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.takeExam();
        student.takeExam();
        teacher.receiveSalary();
    }
}
