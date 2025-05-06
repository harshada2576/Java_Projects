class A
{
	void disp()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("Class B");

	}
}
class C extends B
{
	void disp()
	{
		System.out.println("Class C");
	}
}
public class InheritancePolymporphism
{
	public static void main(String args[])
	{
		A ref;
		ref=new A();
		ref.disp();
		ref=new B();
		ref.disp();
		ref=new C();
		ref.disp();
		
	}

}
//the variable ref is a reference of type A (the parent class). This demonstrates runtime polymorphism (dynamic method dispatch), where the disp() method that gets executed is determined by the actual object that ref refers to at runtime.