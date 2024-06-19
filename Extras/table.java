import java.util.Scanner;
class table
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter No. To Print Table:-");
		int a=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"x"+i+"="+a*i);
		}
	}
}
		