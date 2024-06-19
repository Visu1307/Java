package allinone;
public class mixed
{
	public void loop1()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public void loop2()
	{
		int j=1;
		while(j<=10)
		{
			System.out.println(j);
			j++;		
		}
	}
	public void loop3()
	{
		int k=1;
		do
		{
			System.out.println(k);
			k++;		
		}
		while(k<=10);
	}
	public void conditional1()
	{
		int p=80;
		if(p>=33)
		{
			System.out.println("You have passed the exam :) ");
		}
		else
		{
			System.out.println("Sorry, You failed in the exam :( ");
		}
	}
	public void conditional2()
	{
		int a=13,b=7;
		if(a!=b)
		{
			if(a>b)
			{
				System.out.println("A is big");
			}
			else
			{
				System.out.println("B is big");
			}
		}
	}
	public void conditional3()
	{
		int p=80;
		if(p>=70)
		{
			System.out.println("Distiction");
		}
		else if(p>=60)
		{
			System.out.println("First Class");
		}
		else if(p>=50)
		{
			System.out.println("Second Class");
		}
		else if(p>=40)
		{
			System.out.println("Third Class");
		}
		else if(p>=33)
		{
			System.out.println("Mand Mand Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public void checkday()
	{
		int day=4;
		switch(day) 
		{
			case 1:
				System.out.println("Today Is Monday");
				break;
			case 2:
				System.out.println("Today Is Tuesday");
				break;
			case 3:
				System.out.println("Today Is Wednesday");
				break;
			case 4:
				System.out.println("Today Is Thursday");
				break;
			case 5:
				System.out.println("Today Is Friday");
				break;
			case 6:
				System.out.println("Today Is Saturday");
				break;
			case 7:
				System.out.println("Today Is Sunday");
				break;
			default:
				System.out.println("Invaild day");
		}
	}
}