class Outer
{
	int v=13;
	void test()
	{
		Inner inner=new Inner();
		inner.test();
	}
	class Inner
	{
		void test()
		{
			System.out.println(v);
		}
	}
}
class TestInner
{
	public static void main(String args[])
	{
		Outer out=new Outer();
		out.test();
	}
}