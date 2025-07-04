public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Md.", "Shourov", "2023-816-189", 10000.0);
        employees[1] = new HourlyEmployee("Md.", "Shuvo", "2023-205-204", 200.0, 5);
        employees[2] = new CommissionEmployee("Parvej Mahmud", "Polash", "2021-680-738", 500000, 0.10);
        employees[3] = new BasePlusCommissionEmployee("Md.", "Minhajul", "2017-005-002", 400000, 0.05, 30000);

        for (Employee employee : employees) {
            if (employee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee baseEmployee = (BasePlusCommissionEmployee) employee;
                baseEmployee.increaseBaseSalaryBy10Percent();
            }
            System.out.println("\n----------------------------");
            System.out.println(employee.toString());
            System.out.printf("Earned: %.2f", employee.earnings());
        }
    }
}
