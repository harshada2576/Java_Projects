import p6.*;
import java.util.Scanner;

public class S6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Warranty Period (years) for SmartWatch: ");
        int warranty = scanner.nextInt();
        System.out.print("Enter Size of SmartWatch (S/M/L): ");
        String size = scanner.next();

        SmartWatch watch = new SmartWatch(warranty, size);

        System.out.println("\nSmartWatch Details:");
        System.out.println("Warranty Period: " + watch.getWarrantyPeriod() + " years");
        System.out.println("Size: " + watch.getSize());

        scanner.close();
    }
}
