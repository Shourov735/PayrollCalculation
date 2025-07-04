public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;
    public HourlyEmployee(String firstName, String lastName, String securityNumber, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, securityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    @Override
    public double earnings() {
        if(hoursWorked <= 40) return hourlyWage * hoursWorked;
        else return hourlyWage * 40 + (hourlyWage * (hoursWorked - 40) * 1.5);
    }
    @Override
    public String toString() {
        return "Hourly Employee: " + super.toString() + String.format("\nHourly Wage: %.2f\nHours Worked: %.2f", getHourlyWage(), getHoursWorked());
    }
}
