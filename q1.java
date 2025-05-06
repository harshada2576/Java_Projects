import java.util.Scanner;
public class q1
{

	public static void main(String[] args)
	{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the number of customers:- ");
		 int n = scan.nextInt();
		 int i;
		 int[] customerID = new int[n];
		 int[] units = new int[n];
		 for(i=0;i<n;i++)
		 {
			 System.out.printf("Enter Customer ID %d: ",i+1);
			 customerID[i] = scan.nextInt();
			 System.out.print("Enter Units Consumed: ");
			 units[i] = scan.nextInt();
		 }
		 for(i=0;i<n;i++)
		 {
			 if(units[i]>=0 && units[i]<=100)
			 {
				 System.out.printf("\nCustomer ID: %d | Units: %d | Total Bill: %d",customerID[i],units[i],units[i]*3);
			 }
			 else if(units[i]>=101 && units[i]<=300)
			 {
				 System.out.printf("\nCustomer ID: %d | Units: %d | Total Bill: %d",customerID[i],units[i],units[i]*5);
			 }
			 else if(units[i]>=301)
			 {
				 System.out.printf("\nCustomer ID: %d | Units: %d | Total Bill:  %d",customerID[i],units[i],units[i]*8);
			 }
		 }
		 scan.close();
	 }
}
