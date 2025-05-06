package p4;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02; // 2% interest per annum
    }
}
