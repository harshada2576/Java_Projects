import java.util.*;
class  InvalidTicketIDException extends Exception
{
	public  InvalidTicketIDException()
	{
		System.out.println("Invalid ID");
	}
}
class TicketBooking
{
	void bookTicket(String ticketId) throws InvalidTicketIDException
	{
		final String validid[]= {"T1001", "T1002", "T1003"};
		for(String id:validid)
		{
			if(id.equals(ticketId))
			{
				System.out.println("Booking successful");
				return;
			}
		}
		throw new InvalidTicketIDException();
	}
}
public class OnlineTicketBooking
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		TicketBooking t=new TicketBooking();
		System.out.println("Enter ID:");
		String id=sc.nextLine();
		try
		{
			t.bookTicket(id);
		}
		catch(InvalidTicketIDException e)
		{
			
		}
	}

}
