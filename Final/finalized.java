final class a
{
	final int v=13;
	final void display()
	{
		System.out.println("It is Fixed Method Within a Fixed Class With a Fixed Variable="+v);
	}
}
/*class b extends a
{
	void display()
	{
		System.out.println(v);
	}
}*/
class finalized
{
	public static void main(String args[])
	{
		a obj=new a();
		obj.display();
	}
}