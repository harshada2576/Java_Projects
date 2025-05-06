import java.util.*;
interface A
{
	void display1();
}
interface B
{
	void display2();
}
class C implements A,B
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
}
public class MultipleInheritance
{
	public static void main(String args[])
	{
		C obj=new C();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
