import java.util.*;
class  InvalidPatientIDException extends Exception
{
	public  InvalidPatientIDException()
	{
		System.out.println("Invalid ID");
	}
}
class PatientRecords
{
	private String validid[] = {"P1001","P1002","P1003"};
	void accessRecord(String patientId) throws InvalidPatientIDException
	{
		for(String id : validid)
		{
			if(id.equals(patientId))
			{
				System.out.println("Correct ID");
				return;
			}
		}
		throw new InvalidPatientIDException();
	}
}
public class InvalidPatient
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PatientRecords p=new PatientRecords();
		System.out.println("Enter patient ID:");
		String Id=sc.nextLine();
		try
		{
			p.accessRecord(Id);
		}
		catch(InvalidPatientIDException e)
		{
			
		}
	}
}
