//You use super() to explicitly call the constructor of the parent class from a subclass constructor. This is particularly important if the parent class has a parameterized constructor, as it won’t be invoked automatically.

class Base10
{
	int a;
	Base10(int z)
	{
		a=z;
		System.out.println("a="+a);
	}
	
}
class Derived10 extends Base10
{
	int b;
	Derived10(int x,int y)
	{
		super(x);//Call to base constructor
		b=y;
		System.out.println("b="+b);
	}
}
class ParameterizedConstructor
{
	public static void main(String args[])
	{
		Derived10 d = new Derived10(10,20);
		//calls only derived constructor
	}
}
//if the base class has parameterized constructor then it does not get invoked automatically by the creations of derived class object.we have to call super keyword in derived class constructor
