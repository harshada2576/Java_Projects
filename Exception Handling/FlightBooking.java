import java.util.*;
class SeatAlreadyBookedException extends Exception
{
	public SeatAlreadyBookedException()
	{
		System.out.println("Seat already booked");
	}
}
class Flight
{
	private int booked[]= {10,20,30};
	void  bookSeat(int seatNumber) throws SeatAlreadyBookedException
	{
		for(int id:booked)
		{
			if(id==seatNumber)
			{
				throw new SeatAlreadyBookedException();
			}
		}
		System.out.println("Seat booked");
	}
}
public class FlightBooking
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 Flight booking = new Flight(); 
		 
	        System.out.print("Enter seat number to book (e.g., 4D): "); 
	        int seatNumber = sc.nextInt(); 
	        try 
	        { 
	            booking.bookSeat(seatNumber); 
	        } 
	        catch (SeatAlreadyBookedException e) 
	        { 
	        	
	        } 
	 
	}
}
