class Base
{
	 Base()
	{
		System.out.println("Default constructor of base class");
	}
}
class Derived extends Base
{
	 Derived()
	{
		System.out.println("Default constructor of derived class");
	}
}
public class ContructorOverloading
{
	public static void main(String args[])
	{
		Derived d=new Derived();
	}
}
//Constructor is automatically invoked when an object for the class is created
//If the base class has default constructor then it get automatically called on object creation for derived class
