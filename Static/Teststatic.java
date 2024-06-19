class staticdemo
{
	static int var=10;
	void increment()
	{
		var=var+10;
	}
	static void call()
	{
		System.out.println("Value Of Static Variable= "+var);
	}
	
}
class Teststatic
{
	public static void main(String args[])
	{
		staticdemo obj=new staticdemo();
		obj.increment();
		obj.increment();
		obj.increment();
		obj.increment();
		staticdemo.call();
		staticdemo.call();
	}
}