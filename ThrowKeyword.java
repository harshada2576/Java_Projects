class test
{
	static void divide()
	{
		int x,y,z;
		try
		{
			x=5;
			y=0;
			z=x/y;
			System.out.println(x+"/"+y+"="+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught in Divide.");
			System.out.println("Cannot divide by zero");
			throw e;
		}	
	}
}
public class ThrowKeyword 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of main");
		try
		{
			test.divide();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught in Main.");
			System.out.println(e);
		}
	}
}
