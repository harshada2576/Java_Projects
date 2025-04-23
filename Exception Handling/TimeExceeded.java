import java.util.*;
class TimeExceededException extends Exception
{
	public TimeExceededException()
	{
		System.out.println("Time limit exceeded");
	}
}
class Exam
{
	private int duration=60;
	void  submitExam(int time ) throws TimeExceededException
	 {
		 if(time>duration)
		 {
			 throw new TimeExceededException();
		 }
		 else
		 {
			 System.out.println("Exam submitted ");
		 }
	 }
}
public class TimeExceeded 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		Exam exam = new Exam(); 
	   System.out.print("Enter time taken (in minutes) to submit the exam: "); 
	        int timeTaken = sc.nextInt(); 
	        try
	        {
	        	exam.submitExam(timeTaken);
	        }
	        catch(TimeExceededException e)
	        {
	        	
	        }
	}

}
