public class NestedTryStatement
{
	public static void main(String[] args) 
	{
		int a,b,res;
		try
		{
			try
			{
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				res=a/b;
				System.out.println("Division:"+res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot divide by zero");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Insufficient arguments.");
		}
	}
}
