class disp
{
	public void printOdd()
	{
			//System.out.println("Odd:-");
			for(int i=1;i<=50;i++)
			{
				if(i%2!=0)
				{
					System.out.println("Odd:-"+i+",");
					
				}
			}
	}
	public void printEven()
	{
			//System.out.println("Even:-");
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even:-"+i+",");
				}
			}
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			disp obj=new disp();
			obj.printOdd();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			disp obj=new disp();
			obj.printEven();
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class printOddEven
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}