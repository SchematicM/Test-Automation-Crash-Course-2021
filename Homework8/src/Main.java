public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("1", "James", 50, 80, "AA1234");
        employees[1] = new SalariedEmployee("2", "Jon", 1, 480, "AA1236");
        employees[2] = new SalariedEmployee("3", "Jeremy", 10, 160, "AA1239");
        employees[3] = new ContractEmployee("4", "Jacob",1500, "001");
        employees[4] = new ContractEmployee("5", "Joncy", 3600, "002");

        Employee.sortBySalary(employees);
         for(Employee el: employees)
         {
             System.out.println(el.getEmployeeId() + "   " + el.getName()+ "   " + el.getSalary());
         }
    }
}
