import p5.*;
import java.util.Scanner;

public class S5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        System.out.print("Enter length and width of Rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        System.out.print("Enter base and height of Triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("\nAreas:");
        System.out.println("Circle: " + circle.calculateArea());
        System.out.println("Rectangle: " + rectangle.calculateArea());
        System.out.println("Triangle: " + triangle.calculateArea());

        scanner.close();
    }
}
