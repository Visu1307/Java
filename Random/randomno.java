import java.util.*;
class randomno
{
	public static void main(String args[])
	{
		int counter;
		Random rnum=new Random();
		System.out.println("Random Numbers Generated Below:-");
		for(counter=1;counter<=10;counter++)
		{
			System.out.println(rnum.nextInt(68));
		}
	}
}	
