class shorted_div
{
	public static void main(String args[])
	{
		int a=13;
		int b=0;
		int c;
		try
		{
			c=a/b;
			System.out.println("Division Is ="+c);	
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception Caught :- Can't divide with 0");
		}
	}
}