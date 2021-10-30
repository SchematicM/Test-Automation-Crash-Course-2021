import java.util.*;

public class Student implements Comparable{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return this.getName()+ "   " + this.getCourse();
    }

    public static void printStudents(List<Student> students, int c)
    {
        Iterator<Student> iterator = students.iterator();
        Student s;
        while (iterator.hasNext()) {
            s = iterator.next();
            if (s.getCourse() == c)
                System.out.println(s.getName());
        }
    }

    public static void compareByName(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println(students);
    }

    public static void compareByCourse(List<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        });
        System.out.println(students);
    }

    @Override
    public int compareTo(Object o) {
        Student otherStudent = (Student) o;
        return Comparator.comparing(Student::getName)
                .thenComparingInt(Student::getCourse)
                .compare(this, otherStudent);
    }
}
