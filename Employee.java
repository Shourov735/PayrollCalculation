public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String securityNumber;
    public Employee(String firstName, String lastName, String securityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSecurityNumber() {
        return securityNumber;
    }
    public abstract double earnings();
    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s", getFirstName(), getLastName(), getSecurityNumber());
    }
}
