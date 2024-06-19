abstract class base
{
	abstract void print();
}
class derived extends base
{
	void print()
	{
		System.out.println("It is an Abstract Class' Overridden Method");
	}
}
class abst
{
	public static void main(String args[])
	{
		derived obj=new derived();
		obj.print();
	}
}