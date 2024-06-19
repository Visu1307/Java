class OwnEx extends Exception
{
	OwnEx(String str)
	{
		System.out.println("Exception Is Thrown "+str);
	}
	public static void main(String args[])
	{
		OwnEx oe=new OwnEx("Visu");
		try
		{
			throw oe;
		}
		catch(Exception e)
		{
			System.out.println("I manually throwed and catched exception");
		}
	}
}