public class ContractEmployee extends Employee implements Payable {
    private double fixedPay;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, double fixedPay, String federalTaxIdMember) {
        super(employeeId, name);
        this.fixedPay = fixedPay;
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = calculatePay();
    }

    @Override
    public double calculatePay() {
        return this.fixedPay;
    }
}

