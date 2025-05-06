class Base5
{
	void display()
	{
		System.out.println("Base class Method");
	}
}
class Derived5 extends Base5
{
	void display()
	{
		super.display();
		System.out.println("Derived class Method");
	}
}
public class MethodOverriding 
{
	public static void main(String args[])
	{
		Derived5 d = new Derived5();
		d.display();
	}

}
//If a method in the subclass overrides a method in the parent class, you can use super.methodName() to call the parent class's version of that method
