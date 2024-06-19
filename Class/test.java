class trail
{
	int a;
	public void method1()
	{
		System.out.println("This is Simple Class Method");
	}
	public void method2(int x)
	{
		a=x;
		System.out.println("This is Argumented Class Method:-"+a);
	}
}
class test
{
	public static void main(String args[])
	{
		trail obj=new trail();
		obj.method1();
		obj.method2(13);
	}
}
	