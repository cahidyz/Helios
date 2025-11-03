package lesson12;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {
        System.out.println("1.HashSet: Only one printed, no duplicates here!");
        Set<String> city = new java.util.HashSet<>();
        city.add("San Francisco");
        city.add("Rio de Janeiro");
        city.add("Baku");
        city.add("Baku");

        System.out.println(city);

        System.out.println();

        System.out.println("2.LinkedHashSet: Order is maintained!");
        Set<String> register = new LinkedHashSet<String>();
        register.add("James");
        register.add("Richard");
        register.add("Lennon");
        System.out.println(register);

        System.out.println();

        System.out.println("3.TreeSet: Natural order is maintained!");
        Set<Integer> naturalOrder = new TreeSet<>();
        naturalOrder.add(2);
        naturalOrder.add(5);
        naturalOrder.add(4);
        naturalOrder.add(3);

        System.out.println(naturalOrder);
        System.out.println();

        System.out.println("4.TreeSet: Comparable implementation!");
        Set<Student> studentOrder = new TreeSet<>();
        studentOrder.add(new Student("Cahid", 25));
        studentOrder.add(new Student("James", 27));
        studentOrder.add(new Student("Richard", 28));
        System.out.println(studentOrder);
        System.out.println();

        System.out.println("5.TreeSet: Comparator implementation!");
        TreeSet<Student> studentsByName = new TreeSet<>(
                Comparator.comparing(Student::getName)
        );

        studentsByName.add(new Student("Eli", 22));
        studentsByName.add(new Student("Vusal", 20));
        studentsByName.add(new Student("Anar", 25));

        System.out.println(studentsByName);
    }
}