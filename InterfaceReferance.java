interface area
{
	void cal();
}
class circle implements area
{
	double radius,area;
	public void cal()
	{
		radius=10;
		area=3.14*radius*radius;
		System.out.println("Area:"+area);
	}
}
class triangle implements area
{
	double base,height,area;
	public void cal()
	{
		base=5;
		height=10;
		area=0.5*base*height;
		System.out.println("Area:"+area);
	}
}
public class InterfaceReferance
{
	public static void main(String args[])
	{
		area a;
		a=new circle();
		a.cal();
		a=new triangle();
		a.cal();
	}
}
