import java.util.Scanner;

/*WAP to accept choice from user and display result 

 */
public class Choice 
{
	public static void main(String args[])
	{
		System.out.println("Enter 1:Arithmetic Operator");
		System.out.println("Enter 2:Logical Operator");
		System.out.println("Enter 3:Assignment Operator");
		System.out.println("Enter 4:Bitwise Operator");
		System.out.println("Enter 5:Relational Operator");
		int num1,num2,ch;
		System.out.println("Enter First Number:");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
		System.out.println("Enter Choice:");
		ch=sc.nextInt();
		switch (ch)
		{
		case 1:
			int add,sub,mult,div,mod;
			add=num1+num2;
			sub=num1-num2;
			mult=num1*num2;
			div=num1/num2;
			mod=num1%num2;
			System.out.println("Arithmetic Operator:");
			System.out.println("Addition of numbers:"+add);
			System.out.println("Subtraction of numbers:"+sub);
			System.out.println("Multiplication of numbers:"+mult);
			System.out.println("Division of numbers:"+div);
			System.out.println("Modulus of numbers:"+mod);
			
		break;
		case 2:
			int num3;
			System.out.println("Enter 3rd number:");
			num3=sc.nextInt();
			System.out.println("Logical Operator:");
			System.out.println("Logical AND OPERATOR:"+(num1>num2 && num3>num2));
			System.out.println("Logical OR OPERATOR:"+(num1>num2 || num3>num2));
			System.out.println("Logical NOT OPERATOR:"+(!(num1>num2)));
		break;
		case 3:
			System.out.println("Assignment Operator:");
			System.out.println("+="+(num1+=num2) );
			System.out.println("-="+(num1-=num2) );
			System.out.println("/="+(num1/=num2) );
			System.out.println("%="+(num1%=num2) );
			System.out.println("*="+(num1*=num2) );
		break;
		case 4:
			System.out.println("Bitwise Operator:");
			System.out.println(Integer.toBinaryString(num1));
			System.out.println(Integer.toBinaryString(num2));
			System.out.println("num1&num2="+(num1&num2));
			System.out.println("num1&num2="+(num1|num2));
			System.out.println("num1&num2="+(num1^num2));
		break;
		case 5:
			System.out.println("Relational Operator:");
			System.out.println("<="+(num1<=num2) );
			System.out.println(">="+(num1<=num2) );
			System.out.println("!="+(num1<=num2) );
			System.out.println("=="+(num1<=num2) );
			
		break;
		}
	}
}
