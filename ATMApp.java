// ATMApp.java
import java.util.InputMismatchException;
//InputMismatchException is a runtime exception that occurs when the input provided to a Scanner does not match the expected type.
import java.util.Scanner;

/**
 * Main ATM application that handles user interaction.
 */
public class ATMApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankManager bankManager = new BankManager();

        while (true) {
            System.out.println("\n========== Welcome to Java ATM ==========");
            System.out.print("Enter Account Number (or 'exit' to quit): ");
            String accNumber = scanner.nextLine();

            if (accNumber.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            }

            Client user = bankManager.findClient(accNumber);//This line tries to find a client using the provided accNumber. It calls the findClient method from the bankManager object, which returns a Client object if the account exists, or null if not.
            if (user == null) {
                System.out.println("⚠️ Account not found. Please try again.");
                continue;
            }

            // PIN authentication
            boolean authenticated = false;
            for (int attempts = 1; attempts <= 3; attempts++) {
                System.out.print("Enter 4-digit PIN: ");
                String inputPin = scanner.nextLine();

                if (user.verifyPin(inputPin)) {
                    authenticated = true;
                    break;
                } else {
                    System.out.println("❌ Incorrect PIN. Attempt " + attempts + " of 3.");
                }
            }

            if (!authenticated) {
                System.out.println("🔒 Account locked due to too many incorrect attempts.");
                continue;
            }

            // ATM Menu
            while (true) {
                System.out.println("\n========== ATM Menu ==========");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change PIN");
                System.out.println("5. Back to Account Selection");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    switch (choice) {
                        case 1:
                            System.out.printf("Account: %s (%s)%n", user.getAccountNumber(), user.getAccountType());
                            System.out.printf("Current Balance: $%.2f%n", user.getBalance());
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: $");
                            double depositAmount = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Are you sure you want to deposit? (y/n): ");
                            if (scanner.nextLine().equalsIgnoreCase("y")) {
                                user.deposit(depositAmount);
                                System.out.printf("✅ Deposited $%.2f. New Balance: $%.2f%n", depositAmount, user.getBalance());
                            } else {
                                System.out.println("❎ Deposit cancelled.");
                            }
                            break;
                        case 3:
                            System.out.print("Enter amount to withdraw: $");
                            double withdrawAmount = scanner.nextDouble();
                            scanner.nextLine();
                            System.out.print("Are you sure you want to withdraw? (y/n): ");
                            if (scanner.nextLine().equalsIgnoreCase("y")) {
                                user.withdraw(withdrawAmount);
                                System.out.printf("✅ Withdrawn $%.2f. New Balance: $%.2f%n", withdrawAmount, user.getBalance());
                            } else {
                                System.out.println("❎ Withdrawal cancelled.");
                            }
                            break;
                        case 4:
                            System.out.print("Enter current PIN: ");
                            String currentPin = scanner.nextLine();
                            if (user.verifyPin(currentPin)) {
                                System.out.print("Enter new 4-digit PIN: ");
                                String newPin = scanner.nextLine();
                                System.out.print("Confirm new PIN: ");
                                String confirmPin = scanner.nextLine();
                                if (newPin.equals(confirmPin)) {
                                    user.changePin(newPin);
                                    System.out.println("✅ PIN changed successfully.");
                                } else {
                                    System.out.println("❌ PINs do not match.");
                                }
                            } else {
                                System.out.println("❌ Incorrect current PIN.");
                            }
                            break;
                        case 5:
                            System.out.println("Returning to account selection...");
                            break;
                        case 6:
                            System.out.println("Thank you for using our ATM. Goodbye!");
                            scanner.close();
                            return;
                        default:
                            System.out.println("Invalid option. Please choose 1-6.");
                    }

                    if (choice == 5) break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // clear input
                } catch (IllegalArgumentException e)
                //A method expects a certain type, range, or condition for arguments.
                {
                    System.out.println(" Error: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }
}
