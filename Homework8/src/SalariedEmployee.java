public class SalariedEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hours;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double hourlyRate, int hours, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = calculatePay();
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hours;
    }
}
