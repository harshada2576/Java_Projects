interface outerInterface
{
	void display();
	interface innerInterface
	{
		void myMethod();
	}
}
class NestedInterface implements outerInterface.innerInterface
{
	public void myMethod()
	{
		System.out.println("Nested interface method.");
	}
	public static void main(String args[])
	{
		outerInterface.innerInterface obj=new NestedInterface();
		obj.myMethod();
	}
}
/*
Nested Interface: Interfaces nested within other interfaces are often used to group related functionality and improve organization.

Implementing a Nested Interface: The nested interface must be accessed via its enclosing interface (outerInterface.innerInterface).

Polymorphism: By using the outerInterface.innerInterface reference, your code demonstrates the power of dynamic method binding.
*/