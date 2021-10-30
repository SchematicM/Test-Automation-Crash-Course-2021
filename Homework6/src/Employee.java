import java.util.Objects;
import java.util.Scanner;

public class Employee {
    private String surname;
    private String  name;
    private int yearOFworking;
    private double salary;
    static Scanner in = new Scanner(System.in);


    public Employee()
    {
        name = "Vasya";
        surname = "Pupkin";
        yearOFworking = 0;
        salary = 0;
    }

     public Employee(String name, String surname, int yearOFworking, double salary)
     {
         this.name = name;
         this.surname = surname;
         this.yearOFworking = yearOFworking;
         this.salary = salary;
     }
     public Employee(String name, String surname)
     {
         this.name = name;
         this.surname = surname;
         yearOFworking = 0;
         salary = 300;
     }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearOFworking() {
        return yearOFworking;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOFworking(int yearOFworking) {
        this.yearOFworking = yearOFworking;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", yearOFworking=" + yearOFworking +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }

    //10% increase for each year of working
    public double raiseSalary()
    {
        for(int i = 1; i<this.yearOFworking ; i++)
         this.salary = this.getSalary()*1.1;
        return this.salary;
    }
    // taking 1 dayoff = -3.3% from the salary
    public double salaryWithDaysOff(int days)
    {
        return this.getSalary()-this.getSalary()*days*0.033;
    }

    static Employee input()
    {
        System.out.print( "Name: ");
        String  name = in.next();
        System.out.print( "Surname: ");
        String  surname = in.next();
        System.out.print( "Year of working: ");
        int  year = in.nextInt();
        System.out.print( "Salary: ");
        double  salary = in.nextDouble();
        Employee a = new Employee(name, surname,year,salary);
        return a;
    }
}
