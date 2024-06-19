class rectangle
{
	int length=2;
	rectangle()
	{
		length=3;
		System.out.println("Length Is = "+length);
	}
	//Initializer Block
	{
		System.out.println("Length Is = "+length);
		length=4;
		System.out.println("Length Is = "+length);
	}
}
class Testinit
{
	public static void main(String args[])
	{
		rectangle obj=new rectangle();
	}
}