import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of items to store in the inventory: ");
        int n = scan.nextInt(); // Get the number of items
        int totalInv = 0;

        // Define the inventory array
        int[][] inventory = new int[n][3]; // [n][3] because there are 3 columns: ID, Quantity, and Price per unit

        // Input inventory details
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Item ID for item %d: ", i + 1);
            inventory[i][0] = scan.nextInt(); // Item ID
            System.out.print("Enter Quantity: ");
            inventory[i][1] = scan.nextInt(); // Quantity
            System.out.print("Enter Price per Unit: ");
            inventory[i][2] = scan.nextInt(); // Price per Unit

            // Add the item's value to total inventory value
            totalInv += CalculateValue(inventory[i][1], inventory[i][2]);
        }

        // Display inventory details
        System.out.println("\nInventory Details:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Item ID: %d | Quantity: %d | Value: ₹%d\n",
                inventory[i][0], inventory[i][1], inventory[i][1] * inventory[i][2]);
        }

        // Display total inventory value
        System.out.printf("Total Inventory Value: ₹%d\n", totalInv);
        scan.close(); // Close the scanner
    }

    // Method to calculate the value of an item
    static int CalculateValue(int quantity, int pricePerUnit) {
        return quantity * pricePerUnit;
    }
}
