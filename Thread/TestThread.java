public class TestThread extends Thread
{
	public static void main(String args[])
	{
		TestThread thread=new TestThread();
		thread.start();
		System.out.println("This code is outside of thread");
	}
	public void run()
	{
		try
		{
			Thread.sleep(2000);
			System.out.println("This code is inside of thread");
		}
		catch(Exception e) {}
	}
}