public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String securityNumber, double weeklySalary) {
        super(firstName, lastName, securityNumber);
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
    @Override
    public String toString() {
        return "Salaried Employee: " + super.toString() + String.format("\nWeekly Salary: %.2f", getWeeklySalary());
    }
}
