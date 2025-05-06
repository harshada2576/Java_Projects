interface A5
{
	void display1();
}
interface B5 extends A5
{
	void display2();
}
interface C5 extends A5
{
	void display3();
}
class D implements B5,C5
{
	public void display1()
	{
		System.out.println("Interface A");
	}
	public void display2()
	{
		System.out.println("Interface B");
	}
	public void display3()
	{
		System.out.println("Interface C");
	}
	public void display4()
	{
		System.out.println("Interface D");
	}
}

public class HybridInheritance 
{
	public static void main(String args[])
	{
		D d=new D();
		d.display1();
		d.display2();
		d.display3();
		d.display4();
	}

}
