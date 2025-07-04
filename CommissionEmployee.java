public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String securityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, securityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
    @Override
    public String toString() {
        return "Commission Employee: " + super.toString() +
                String.format("\nGross Sales: %.2f; Commission Rate: %.2f", grossSales, commissionRate);
    }
}
