import java.util.Scanner;

public class Square 
{
	public static void main(String args[])
	{
		//declaring variable
		int num,sq;
		//Taking a number from user
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		//Taking square of a number 
		sq=num*num;
		if(sq>100)//condition
		{
			System.out.println("The square of the " +num+" is " +sq);
		}
	}
}
