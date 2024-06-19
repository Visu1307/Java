import java.util.Scanner;
class division
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First Value:-");
		a=input.nextInt();
		System.out.print("Enter Second Value:-");
		b=input.nextInt();
		try
		{
			c=a/b;
			System.out.println("Division Is ="+c);	
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception Caught :- Can't divide with 0");
		}
	}
}
		