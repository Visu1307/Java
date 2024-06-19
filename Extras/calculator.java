import java.io.*;
import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		int a,b,c;
		char opr;
		Scanner input=new Scanner(System.in);
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter First Number:-");
		a=input.nextInt();
		System.out.print("Enter Opeartor:-");
		opr=reader.next().charAt(0);
		System.out.print("Enter Second Value:-");
		b=input.nextInt();
		switch(opr)
		{
			case '+':
				c=a+b;
				System.out.println("Answer Is = "+c);
				break;
			case '-':
				c=a-b;
				System.out.println("Answer Is = "+c);
				break;
			case '*':
				c=a*b;
				System.out.println("Answer Is = "+c);
				break;
			case '/':
			try
			{
				c=a/b;
				System.out.println("Answer Is = "+c);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("Can't Divide With Zero");
			}
			break;
			default:
				System.out.println("Invaild Choice");
		}
	}
}