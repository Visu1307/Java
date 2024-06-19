class base
{
	void method1()
	{
		System.out.println("I am Base Class");
	}
}
class derived extends base
{
	void method2()
	{
		System.out.println("I am Derived Class");
	}
}
class Single
{
	public static void main(String args[])
	{
		derived obj=new derived();
		obj.method1();
		obj.method2();
	}
}