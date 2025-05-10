import p10.*;
import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Electronics Product ID: ");
        String eId = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Electronics Name: ");
        String eName = scanner.nextLine();
        System.out.print("Enter Electronics Price: ");
        double ePrice = scanner.nextDouble();
        System.out.print("Enter Warranty Period (years): ");
        int warranty = scanner.nextInt();
        Electronics electronics = new Electronics(eId, eName, ePrice, warranty);

        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter Clothing Product ID: ");
        String cId = scanner.next();
        scanner.nextLine();
        System.out.print("Enter Clothing Name: ");
        String cName = scanner.nextLine();
        System.out.print("Enter Clothing Price: ");
        double cPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Size: ");
        String size = scanner.next();
        Clothing clothing = new Clothing(cId, cName, cPrice, size);

        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter Book Product ID: ");
        String bId = scanner.next();
        scanner.nextLine();
        System.out.print("Enter Book Name: ");
        String bName = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double bPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        Book book = new Book(bId, bName, bPrice, author);

        System.out.println("\nProduct Details:");
        electronics.displayDetails();
        System.out.println();
        clothing.displayDetails();
        System.out.println();
        book.displayDetails();

        scanner.close();
    }
}
