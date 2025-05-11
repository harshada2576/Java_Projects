import p12.*;
import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Faculty Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();

        Faculty faculty = new Faculty(name, age, empId, salary, dept, designation);

        System.out.println("\nFaculty Details:");
        faculty.displayDetails();

        scanner.close();
    }
}
