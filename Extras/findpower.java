import java.util.Scanner;
class findpower
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int base,power,res=1,i;
		System.out.print("Enter Base:-");
		base=input.nextInt();
		System.out.print("Enter Power:-");
		power=input.nextInt();
		for(i=1;i<=power;i++)
		{
			res=res*base;
		}
		System.out.println("Answer Is = "+res);
	}
}