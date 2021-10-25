import java.time.Year;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;
    static Scanner in = new Scanner(System.in);


    public Person(){}
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age ()
    {
        Year now = Year.now();
        return Integer.parseInt(now.toString()) - this.getBirthYear();
    }

    static Person input()
    {
        System.out.print( "Name?  ");
        String  name = in.next();
        System.out.print( "Year of birth: ");
        int  year = in.nextInt();
        Person a = new Person(name, year);
        return a;
    }

    public void output()
    {
        System.out.println("Name : "+ this.getName()) ;
        System.out.println("birthYear : "+ this.getBirthYear()) ;
        System.out.println("Age : "+ this.age()) ;


    }

    public void changeName(String n)
    {
        this.setName(n);
    }
}
