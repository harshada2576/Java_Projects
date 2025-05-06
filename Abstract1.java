import java.util.*;
abstract class Roundshape
{
	double radius;
	final double pi=3.14;
	abstract void findarea();
	abstract void findvolume();
	void display()
	{
		System.out.println("This is an example of abstract class.");
	}
	
}
class sphere extends Roundshape
{
	Scanner sc=new Scanner(System.in);
	void findarea()
	{
		System.out.println("Enter radius:");
		radius=sc.nextDouble();
		System.out.println("Area of sphere is "+4*pi*radius*radius);
	}
	void findvolume()
	{
		System.out.println("Enter radius:");
		radius=sc.nextDouble();
		System.out.println("Volume of sphere is "+(4/3)*pi*radius*radius*radius);
	}
}
public class Abstract1 
{

	public static void main(String[] args)
	{
		sphere s=new sphere();
		s.display();
		s.findarea();
		s.findvolume();
	}
}
