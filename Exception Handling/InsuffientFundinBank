// Custom Exception 
class InsuAicientFundsException extends Exception { 
    public InsuAicientFundsException(String message) { 
        super(message); 
    } 
} 
 
// BankAccount Class 
class BankAccount { 
    private double balance; 
 
    public BankAccount(double balance) { 
        this.balance = balance; 
    } 
 
    public void withdraw(double amount) throws 
InsuAicientFundsException { 
        if (amount > balance) { 
            throw new InsuAicientFundsException("InsuAicient 
funds! Shortfall: $" + (amount - balance)); 
        } 
        balance -= amount; 
        System.out.println("Withdrawal successful! 
Remaining balance: $" + balance); 
    } 
} 
 
// Main Class 
public class H1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        BankAccount account = new BankAccount(1000); // 
Initial balance 
 
        System.out.print("Enter withdrawal amount: "); 
        double amount = sc.nextDouble(); 
 
        try { 
            account.withdraw(amount); 
        } catch (InsuAicientFundsException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
 
        sc.close(); 
    } 
}
