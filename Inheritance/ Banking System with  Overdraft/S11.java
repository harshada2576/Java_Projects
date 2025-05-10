import p11.*;
import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Savings Account Number: ");
        String savingsAccNum = scanner.next();
        System.out.print("Enter Savings Account Balance: ");
        double savingsBalance = scanner.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccNum, savingsBalance);

        System.out.print("\nEnter Current Account Number: ");
        String currentAccNum = scanner.next();
        System.out.print("Enter Current Account Balance: ");
        double currentBalance = scanner.nextDouble();
        CurrentAccount currentAccount = new CurrentAccount(currentAccNum, currentBalance);

        System.out.println("\nPerform Withdrawal (Savings Account)");
        System.out.print("Enter amount: ");
        double savingsWithdraw = scanner.nextDouble();
        savingsAccount.withdraw(savingsWithdraw);

        System.out.println("\nPerform Withdrawal (Current Account)");
        System.out.print("Enter amount: ");
        double currentWithdraw = scanner.nextDouble();
        currentAccount.withdraw(currentWithdraw);

        scanner.close();
    }
}
