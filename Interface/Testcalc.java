import java.util.Scanner;
interface calc1
{
	void method1(double a,double b);
}
interface calc2
{
	void method2(double c,double d);
}
interface calc3
{
	void method3(double e,double f);
}
interface calc4
{
	void method4(double g,double h);
}
class all implements calc1,calc2,calc3,calc4
{
	double a,b,c,d,e,f,g,h;
	public void method1(double x,double y)
	{
		a=x;
		b=y;
	}
	public void add()
	{
		System.out.print("Addition Is = ");
		System.out.println(a+b);
	}
	public void method2(double v,double w)
	{
		c=v;
		d=w;
	}
	public void sub()
	{
		System.out.print("Subtraction Is = ");
		System.out.println(c-d);
	}
	public void method3(double t,double u)
	{
		e=t;
		f=u;
	}
	public void mul()
	{
		System.out.print("Multiplication Is = ");
		System.out.println(e*f);
	}
	public void method4(double r,double s)
	{
		g=r;
		h=s;
	}
	public void div()
	{
		if(h!=0)
		{
			System.out.print("Division Is = ");
			System.out.println(g/h);
		}
		else
		{
			System.out.println("Can't divide with zero");
		}
	}
}
class Testcalc
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("--:  TWO VALUE CALC USING INTERFACE  :--");
		System.out.println("1) Addition");
		System.out.println("2) Subtraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) ALL OF THE ABOVE");
		System.out.print("Select Your Choice:-");
		int choice=input.nextInt();
		System.out.print("Enter First Value:-");
		double val1=input.nextDouble();
		System.out.print("Enter Second Value:-");
		double val2=input.nextDouble();
		all obj_all=new all();
		obj_all.method1(val1,val2);
		obj_all.method2(val1,val2);
		obj_all.method3(val1,val2);
		obj_all.method4(val1,val2);
		switch(choice)
		{
			case 1:
				obj_all.add();
				break;
			case 2:
				obj_all.sub();
				break;
			case 3:
				obj_all.mul();
				break;
			case 4:
				obj_all.div();
				break;
			case 5:
				obj_all.add();
				obj_all.sub();
				obj_all.mul();
				obj_all.div();
				break;
			default:
				System.out.println("Invaild Choice");
		}
	}
}