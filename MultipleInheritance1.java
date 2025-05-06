import java.util.*;
interface student
{
	void getdata();
}
interface sports
{
	void getsports();
}
class result implements student,sports
{
	int rno;
	String name;
	double Java,Syspro,IP,total,avg,sp;
	Scanner sc=new Scanner(System.in);
	public void getdata()
	{
		System.out.println("Enter rno,name,marks of Java,Syspro and IP:");
		rno=sc.nextInt();
		sc.nextLine();
		name=sc.nextLine();
		Java=sc.nextDouble();
		Syspro=sc.nextDouble();
		IP=sc.nextDouble();
	}
	public void getsports()
	{
		System.out.println("Enter sports marks:");
		sp=sc.nextDouble();
	}
	void cal()
	{
		total=Java+Syspro+IP+sp;
		avg=total/4;
		System.out.println("Total is " +total +"and average is "+avg);
	}
}
public class MultipleInheritance1
{
	public static void main(String args[])
	{
		result r=new result();
		r.getdata();
		r.getsports();
		r.cal();
	}

}
