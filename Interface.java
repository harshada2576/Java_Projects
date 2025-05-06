import java.util.Scanner;

interface  Roundshape
{
	final double pi=3.14;
	abstract void findarea();
	abstract void findvolume();
	
}
class sphere implements Roundshape
{
	Double radius;
	Scanner sc=new Scanner(System.in);
	public void findarea()
	{
		System.out.println("Enter radius:");
		radius=sc.nextDouble();
		System.out.println("Area of sphere is "+4*pi*radius*radius);
	}
	public void findvolume()
	{
		System.out.println("Enter radius:");
		radius=sc.nextDouble();
		System.out.println("Volume of sphere is "+(4/3)*pi*radius*radius*radius);
	}
}
 class Abstract1 
{

	public static void main(String[] args)
	{
		sphere s=new sphere();
		s.findarea();
		s.findvolume();
	}
}
/*
 Interface must be implemented to define its abstract class
 all methods in interface are abstract 
 all methods defined in child class must be public 
 all variables in interface should be final
 interface does not have constructor
 */