import java.util.*;
import java.time.*;
class  InvalidCheckInDateException extends Exception
{
	void  InvalidCheckInDateException()
	{
		System.out.println("Invalid date");
	}
}
class HotelBooking
{
	void bookRoom(LocalDate checkInDate) throws InvalidCheckInDateException
	{
		if(checkInDate.isBefore(checkInDate.now()))
		{
			throw new InvalidCheckInDateException();
		}
		System.out.println("Room booked successfully for " + checkInDate);
	}
}
public class Checkin
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        HotelBooking hotel = new HotelBooking();
        System.out.println("Enter checkin date:");
        LocalDate checkInDate=LocalDate.parse(sc.next());
        try
        {
        	hotel.bookRoom(checkInDate);
        }
        catch(InvalidCheckInDateException e)
        {
        	
        }
	}
}
