import java.util.Scanner;
class a
{
	int a;
	void input()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter One Value:-");
		a=input.nextInt();
	}
}
class b extends a
{
	int b;
	void square()
	{
		b=a*a;
		System.out.println("Square Is = "+b);
	}
}
class c extends b
{
	int c;
	void cube()
	{
		c=a*a*a;
		System.out.println("Cube Is = "+c);
	}
}
class d extends c
{
	void show()
	{
		input();
		System.out.println("Observations Are As Follows:-");
		square();
		cube();
	}
}
class multilevel
{
	public static void main(String args[])
	{
		d obj=new d();
		obj.show();
	}
}
	
		
		
		