package p12;

public class Faculty extends Employee {
    private String department, designation;

    public Faculty(String name, int age, int employeeId, double salary, String department, String designation) {
        super(name, age, employeeId, salary);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department + ", Designation: " + designation);
    }
}
