import p9.*;
import java.util.Scanner;

public class S9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side of Square: ");
        double squareSide = scanner.nextDouble();
        Square square = new Square(squareSide);

        System.out.print("Enter radius of Circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);

        System.out.print("Enter three sides of Triangle: ");
        double s1 = scanner.nextDouble();
        double s2 = scanner.nextDouble();
        double s3 = scanner.nextDouble();
        Triangle triangle = new Triangle(s1, s2, s3);

        System.out.println("\nPerimeters:");
        System.out.println("Square: " + square.calculatePerimeter());
        System.out.println("Circle: " + circle.calculatePerimeter());
        System.out.println("Triangle: " + triangle.calculatePerimeter());

        scanner.close();
    }
}
