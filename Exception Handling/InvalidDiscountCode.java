import java.util.*;

class InvalidDiscountCodeException extends Exception 
{
    public InvalidDiscountCodeException() 
    {
        System.out.println("Invalid Coupon code");
    }
}

class Coupon
{
    private String validCode[] = {"SAVE10","WELCOME20"};

    public void apply(String code) throws InvalidDiscountCodeException
    {
    	for(String id:validCode)
        if (id.equals(code)) 
        {  // Use equals() for string comparison
            System.out.println("Discount applied.");

        } 
        else
        {
            throw new InvalidDiscountCodeException();
        }
    }
}

public class InvalidDiscountCode
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coupon code:");
        String code = sc.nextLine();
        sc.close();  // Close scanner to avoid resource leak
        
        Coupon c = new Coupon();
        try
        {
            c.apply(code);
        } 
        catch (InvalidDiscountCodeException e) 
        {
            
        }
    }
}
