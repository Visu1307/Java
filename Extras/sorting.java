import java.util.*;
class sorting
{
	public static void main(String args[])
	{
		int[] a={50,30,10,40,20};
		System.out.println("Array Before Sorting:-");
		for(int i : a)
		{
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Array After Sorting:-");
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}