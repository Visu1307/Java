interface trail1
{
	public void method1();
}
interface trail2
{
	public void method2();
}
class multiple implements trail1,trail2
{
	public void method1()
	{
		System.out.println("This is First Interface Overridden Method");
	}
	public void method2()
	{
		System.out.println("This is Second Interface Overridden Method");
	}
}
class TestInterface
{
	public static void main(String args[])
	{
		multiple obj=new multiple();
		obj.method1();
		obj.method2();
	}
}