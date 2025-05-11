package p12;

public class Employee extends Person {
    protected int employeeId;
    protected double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
    }
}
