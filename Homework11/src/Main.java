import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marta", 5));
        students.add(new Student("Volodya", 7));
        students.add(new Student("Tanya", 4));
        students.add(new Student("Vasya", 1));
        students.add(new Student("Petro", 4));
        for (Student s : students)
            System.out.println(s);

        System.out.println("Students of 4th course: ");
        Student.printStudents(students, 4);

        System.out.println("Students ordered by name: ");
        Student.compareByName(students);

        System.out.println("Students ordered by course: ");
        Student.compareByCourse(students);
    }}
