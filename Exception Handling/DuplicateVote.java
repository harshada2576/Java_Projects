import java.util.*;
class DuplicateVoteException extends Exception
{
	public DuplicateVoteException()
	{
		System.out.println("Already voted");
	}
}
class VotingSystem
{
	private final String Validid[]= {"U001", "U002", "U003"};
	void castVote( String userId) throws DuplicateVoteException
	{
		for(String id:Validid)
		{
			if(id.equals(userId))
			{
				throw new DuplicateVoteException();
			}
		}
		System.out.println("Sucessfully voted");
	}
}
public class DuplicateVote
{
	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in); 
	        VotingSystem voting = new VotingSystem(); 
	 
	        System.out.print("Enter your User ID to vote: "); 
	        String userId = sc.next(); 
	 
	        try
	        { 
	            voting.castVote(userId); 
	        } 
	        catch 
	        (DuplicateVoteException e)
	        {
	        	
	        }
	}

}
