class myDemo
{
	public synchronized void display(String name)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Entered Name Is = "+name);
		}
	}
}
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			myDemo obj=new myDemo();
			obj.display("Visu");
			Thread.sleep(5000);
		}
		catch(Exception e) {}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			myDemo obj=new myDemo();
			obj.display("Visu");
			Thread.sleep(1000);
		}
		catch(Exception e) {}
	}
}
public class SynchronizeDemo
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
		t2.suspend();
	}
}
		