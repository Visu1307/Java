class outer
{
	void method_out()
	{
		System.out.println("I am Outer Class Method");
	}
	class inner
	{
		void method_in()
		{
			System.out.println("I am Inner Class Method");
		}
	}
}
class nestedcls
{
	public static void main(String args[])
	{
		outer obj=new outer();
		outer.inner obj2=obj.new inner();
		obj.method_out();
		obj2.method_in();
	}
}