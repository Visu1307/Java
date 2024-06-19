//Swapping two values without third variable
class swap
{
	public static void main(String args[])
	{
		int num1=13;
		int num2=7;
		System.out.println("Before Swapping:-");
		System.out.println("Value 1:-"+num1);
		System.out.println("Value 2:-"+num2);
		num1=num1+num2; //20=13+7
		num2=num1-num2; //13=20-7
		num1=num1-num2;	 //7=20-13
		System.out.println("After Swapping:-");
		System.out.println("Value 1:-"+num1);
		System.out.println("Value 2:-"+num2);	
	}
}