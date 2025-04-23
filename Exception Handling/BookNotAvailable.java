class BookNotAvailableException extends Exception
{
	public BookNotAvailableException()
	{
	System.out.println("Book Not Available");
	}
}
class Library
{
	private int validid[]= {101, 102, 103};
	void  borrowBook(int bookId) throws BookNotAvailableException
	{
		for(int id:validid)
		{
			if(id==bookId)
			{
				System.out.println("Book Available");
				return;
			}
		}
		
	throw new BookNotAvailableException();
	}
}
public class BookNotAvailable 
{

	public static void main(String[] args)
	{
		Library l=new Library();
		try
		{
		l.borrowBook(101);
		}
		catch(BookNotAvailableException e)
		{
			
		}
	}

}
