import java.util.*;
class  InvalidPickupLocationException extends Exception
{
	public  InvalidPickupLocationException()
	{
		System.out.println("Invalid location");
	}
}
class RideBooking 
{
	void  bookRide(String pickupLocation) throws InvalidPickupLocationException
	{
		final String location[]= {"Downtown", "Airport", "Suburb"};
		for(String id:location)
		{
			if(id.equals(pickupLocation))
			{
				System.out.println("Ride booked");
				return;
			}
		}
		throw new InvalidPickupLocationException();	
	}
}
public class InvalidPickup
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		RideBooking r=new RideBooking();
		System.out.println("Enter location:");
		String location=sc.nextLine();
		try
		{
			r.bookRide(location);
		}
		catch(InvalidPickupLocationException e)
		{
			
		}

	}
}
