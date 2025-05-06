class base
{
	final void display()
	{
		System.out.println("Base Class Method");
	}
}
/*class derived extends base
{
	void display()
	{
		super.display();
		System.out.println("Derived Class Method");
	}
}*/
public class FinalMethod 
{
	public static void main(String args[])
	{
		base b=new base();
		b.display();
	}
}
//final method cannot be overridden by subclasses
