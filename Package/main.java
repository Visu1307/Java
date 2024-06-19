import allinone.*;
import java.util.Scanner;
public class main
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		mixed obj=new mixed();
		int i=1;
		do
		{
			i++;				
			System.out.println("\nPRESS :- ");
			System.out.println("1) FOR LOOP");
			System.out.println("2) WHILE LOOP");
			System.out.println("3) DO WHILE LOOP");
			System.out.println("4) IF ELSE");
			System.out.println("5) NESTED IF");
			System.out.println("6) ELSE IF LADDER");
			System.out.println("7) SWITCH");
			System.out.print("Enter Your Choice:-");
			int choice=input.nextInt();
			switch(choice)
			{
				case 1:
					obj.loop1();
					break;
				case 2:
					obj.loop2();
					break;
				case 3:
					obj.loop3();
					break;
				case 4:
					obj.conditional1();
					break;
				case 5:
					obj.conditional2();
					break;
				case 6:
					obj.conditional3();
					break;
				case 7:
					obj.checkday();
					break;
				default:
					System.out.println("Invaild Choice");
			}
		}while(i!=8);
	}
}