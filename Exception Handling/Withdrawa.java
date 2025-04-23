import java.util.*;
class InsufficientFundsException extends Exception
{
	public InsufficientFundsException()
	{
		System.out.println("insufficient balance");
	}
}
class Bank
{
    private double balance;
	public Bank(double balance)
	{
		this.balance=balance;
	}
	void withdraw(double amount) throws InsufficientFundsException
	{
		if(amount>balance)
		{
			throw new InsufficientFundsException();
		}
		else
		{
			balance=amount-balance;
			System.out.println(balance);
		}
	}
}
public class Withdrawa 
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank account = new Bank(1000); // Initial balance

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try 
        {
            account.withdraw(amount);
        } 
        catch (InsufficientFundsException e) 
        {
         
        }
    }

}
