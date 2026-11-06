package Homework.hw12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentRanking {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ion", 8));
        students.add(new Student("Ana", 9));
        students.add(new Student("Bob", 8));
        System.out.println(rank(students));
        System.out.println(rank(new ArrayList<>()));
    }

    public record Student(String name, int grade) {

    }
    public static List<Student> rank(List<Student> students) {
        List<Student> result= new ArrayList<>(students);
        result.sort(Comparator.comparingInt(Student::grade).reversed()
                .thenComparing(Student::name, String.CASE_INSENSITIVE_ORDER));
        return result;
    }
}
