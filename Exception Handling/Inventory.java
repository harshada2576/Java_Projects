import java.util.*;
class  OutOfStockException extends Exception
{
	public  OutOfStockException()
	{
		System.out.println("out of stock.");
	}
}
class In
{
	private String validid[]= {"I101", "I102", "I103"};
	void purchaseItem( String item) throws OutOfStockException
	{
		for(String id:validid)
		{
			if(id.equals(item))
			{
				System.out.println("Item availabe");
				return;
			}
		}
		throw new OutOfStockException();
	}
}
public class Inventory 
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in); 
	        In inventory = new In(); 
	        System.out.print("Enter Item ID to purchase: "); 
	        String itemId = sc.next(); 
	 
	        try
	        { 
	            inventory.purchaseItem(itemId); 
	        } 
	        catch (OutOfStockException e)
	        {
	        	
	        }
	}

}
