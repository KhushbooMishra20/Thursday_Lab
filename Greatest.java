import java.util.Scanner;

public class Greatest
{
	public static void main(String args[])
	{
		//declaring variable
		int num1,num2;
		//Taking number1 from user
		System.out.println("Enter First number: ");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		//Taking number2 from user
		System.out.println("Enter Second number: ");
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1+"is greater then"+num2);
		}
		else
		{
			System.out.println(num2+" is greater than "+num1);
		}

	}
}
