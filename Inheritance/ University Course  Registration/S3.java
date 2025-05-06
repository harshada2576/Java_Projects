import p3.*;
import java.util.Scanner;

public class S3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Theory Course Details:");
        System.out.print("Course Code: ");
        String theoryCode = scanner.next();
        System.out.print("Course Name: ");
        scanner.nextLine();
        String theoryName = scanner.nextLine();
        TheoryCourse theoryCourse = new TheoryCourse(theoryCode, theoryName);

        System.out.println("\nEnter Lab Course Details:");
        System.out.print("Course Code: ");
        String labCode = scanner.next();
        System.out.print("Course Name: ");
        scanner.nextLine();
        String labName = scanner.nextLine();
        System.out.print("Lab Fee: ");
        double labFee = scanner.nextDouble();
        LabCourse labCourse = new LabCourse(labCode, labName, labFee);

        System.out.println("\nCourse Details:");
        theoryCourse.displayCourseDetails();
        System.out.println();
        labCourse.displayCourseDetails();

        scanner.close();
    }
}
