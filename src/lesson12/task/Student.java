package lesson12.task;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age); // yaşa görə sort
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
