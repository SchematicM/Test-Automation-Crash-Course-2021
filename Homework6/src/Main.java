public class Main {
    public static void main(String[] args) {
        Employee a1 = new Employee();
        Employee a2 = new Employee("Marta","Khoma");
        Employee a3 = new Employee("Volodya","Oleksiuk",2,2200);
        Employee a4 = new Employee("Tanya","Shchurko",0,600);
        Employee a5 = new Employee("Tanya","Shchurk",1,600);


        //Employee a5 = Employee.input();

        Employee[] workers = new Employee[]{a1,a2,a3,a4};
        for (Employee el : workers)
        {
            System.out.println(el);
        }
        //System.out.println(a3.raise_salary());
        //System.out.println(a3);
        System.out.println(a3.salaryWithDaysOff(5));
        System.out.println(a3);
        System.out.println(a4.equals(a5));
        System.out.println(a4.hashCode());
    }



}
