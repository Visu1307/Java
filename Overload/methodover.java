class math
{
	void Add(int a,int b)
	{
		System.out.println("Addition Is = "+(a+b));
	}
	void Add(double a,double b)
	{
		System.out.println("Addition Is = "+(a+b));
	}
	void Add(int a,int b,int c)
	{
		System.out.println("Addition Is = "+(a+b+c));
	}
}
class methodover
{
	public static void main(String args[])
	{
		math obj=new math();
		obj.Add(13,7);
		obj.Add(13.7,7.13);
		obj.Add(13,7,4);
	}
}