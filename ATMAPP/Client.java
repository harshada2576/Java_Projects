// Client.java
/**
 * Represents a bank client's(Customer) account.
 */
public class Client {
    private String accountNumber;
    private String accountType;
    private double balance;
    private String pin;

    public Client(String accountNumber, String accountType, double balance, String pin) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.pin = pin;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void changePin(String newPin) {
        this.pin = newPin;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
    }
   // * IllegalArgumentException is a runtime exception in Java that occurs when a method receives an argument that is not valid or inappropriate for its expected logic.


    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds.");
        balance -= amount;
    }
}
