public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, securityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }
    public void increaseBaseSalaryBy10Percent() {
        baseSalary *= 1.10;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "Base Plus " + super.toString() +
                String.format("\nBase Salary: %.2f", baseSalary);
    }
}
