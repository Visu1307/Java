public class TestThread2 implements Runnable
{
	public static void main(String args[])
	{
		TestThread obj=new TestThread();
		Thread thread=new Thread(obj);
		thread.start();
		System.out.println("This code is outside of thread");
	}
	public void run()
	{
		System.out.println("This code is inside of thread");	
	}
}