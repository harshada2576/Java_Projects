final class base1
{
	final void display()
	{
		System.out.println("Base Class Method");
	}
}
/*class derived extends base1
{
	void display()
	{
		super.display();
		System.out.println("Derived Class Method");
	}
}*/
public class FinalClass
{
	public static void main(String args[])
	{
		base1 b=new base1();
		b.display();
	}

}
//when is class is declared final ,it is called a final class. A final class cannot be inherited
