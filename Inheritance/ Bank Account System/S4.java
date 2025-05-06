import p4.*;
import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Savings Account Details:");
        System.out.print("Account Number: ");
        String savingsNumber = scanner.next();
        scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String savingsHolder = scanner.nextLine();
        System.out.print("Balance: ");
        double savingsBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsNumber, savingsHolder, savingsBalance);

        System.out.println("\nEnter Current Account Details:");
        System.out.print("Account Number: ");
        String currentNumber = scanner.next();
        scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String currentHolder = scanner.nextLine();
        System.out.print("Balance: ");
        double currentBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentNumber, currentHolder, currentBalance);

        System.out.println("\nAccount Details and Interest:");
        savingsAccount.displayAccountDetails();
        System.out.println("Interest Earned: " + savingsAccount.calculateInterest());

        System.out.println();
        currentAccount.displayAccountDetails();
        System.out.println("Interest Earned: " + currentAccount.calculateInterest());

        scanner.close();
    }
}
