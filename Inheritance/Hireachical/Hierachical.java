class base
{
	void method1()
	{
		System.out.println("This is a method for Derived 1 Class");
	}
	void method2()
	{
		System.out.println("This is a method for Derived 2 Class");
	}
	void method3()
	{
		System.out.println("This is a method for Derived 3 Class");
	}
	void method4()
	{
		System.out.println("This is a method for Derived 4 Class");
	}
}
class derived1 extends base {}
class derived2 extends base {}
class derived3 extends base {}
class derived4 extends base {}
class Hierachical
{
	public static void main(String args[])
	{
		derived1 obj1=new derived1();
		derived2 obj2=new derived2();
		derived3 obj3=new derived3();
		derived4 obj4=new derived4();
		obj1.method1();
		obj2.method2();
		obj3.method3();
		obj4.method4();
	}
}