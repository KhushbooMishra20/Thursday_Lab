import java.util.Scanner;

public class Price {

	public static void main(String[] args)
	{
		//declaring variable
		int selling_price,cost_price;
		//Taking selling price from user 
		System.out.println("Enter selling price:");
		Scanner sc=new Scanner(System.in);
		selling_price=sc.nextInt();
		//Taking cost price from user 
		System.out.println("Enter Cost price:");
		cost_price=sc.nextInt();
		if(selling_price>cost_price)//condition1
		{
			System.out.println("There is a Profit.");//statement 1
		}
		else if(cost_price>selling_price)//condition 2
		{
			System.out.println("There is a Loss");//statement 2
		}
		else
		{
			System.out.println("Neither Loss nor Profit");//statement 3
		}

	}

}