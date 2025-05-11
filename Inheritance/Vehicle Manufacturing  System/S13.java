import p13.*;
import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Model: ");
        String carModel = scanner.nextLine();
        Car car = new Car(carModel);

        System.out.print("Enter Bike Model: ");
        String bikeModel = scanner.nextLine();
        Bike bike = new Bike(bikeModel);

        System.out.print("Enter Truck Model: ");
        String truckModel = scanner.nextLine();
        Truck truck = new Truck(truckModel);

        System.out.println("\nVehicle Details:");
        car.displayDetails();
        System.out.println();
        bike.displayDetails();
        System.out.println();
        truck.displayDetails();

        scanner.close();
    }
}
