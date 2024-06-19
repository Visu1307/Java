class constover
{
	constover()
	{
		System.out.println("I am default constructor");
	}
	constover(int x,int y)
	{
		System.out.println("I am parameterized constructor");
		System.out.println("Addition Is = "+(x+y));
	}
}
class Testconstover
{
	public static void main(String args[])
	{
		constover obj=new constover();
		constover obj2=new constover(13,7);
	}
}