import java.util.*;
class  AgeRestrictionException extends Exception
{
	public  AgeRestrictionException()
	{
		System.out.println("Underage");
	}
}
class  UserRegistration
{
	private final int Age=18;
	void registerUser(int age) throws AgeRestrictionException
	{
		if(age>=Age)
		{
			System.out.println("Successful");
			return;
		}
		throw new AgeRestrictionException();
	}
}
public class Age
{

	public static void main(String[] args)
	{
		  Scanner sc = new Scanner(System.in); 
	        UserRegistration registration = new UserRegistration(); 
	 
	        System.out.print("Enter your age: "); 
	        int age = sc.nextInt(); 
	 
	        try
	        { 
	            registration.registerUser(age); 
	        } 
	        catch (AgeRestrictionException e)
	        { 

	        } 
	}

}
