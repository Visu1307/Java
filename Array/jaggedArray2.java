class jaggedArray2
{
	public static void main(String args[])
	{
		int[][] myArray=new int[3][];
		myArray[0]=new int[]{1,2,3};
		myArray[1]=new int[]{4,5};
		myArray[2]=new int[]{6,7,8,9};
		for(int i=0;i<myArray.length;i++)
		{
			for(int j=0;j<myArray[i].length;j++)
			{
				System.out.println(myArray[i][j]+"");
				System.out.println();
			}
		}
	}
}