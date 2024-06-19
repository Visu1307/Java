import java.util.*;
class updatedRandomGame
{
	public static void main(String args[])
	{
		int guess=0,noOfGuess=0,secretNo=0;
		Scanner input=new Scanner(System.in);
		Scanner string_in=new Scanner(System.in);
		System.out.println("\n\t\t\t\t::Guess and Win::");
		System.out.println("*INSTRUCTIONS*");
		System.out.println("->There is a secret number between specific modes.");
		System.out.println("->You have to guess that number.");
		System.out.println("->There are three modes like:-");
		System.out.println("->Easy :- It ranges between 1 to 20.");
		System.out.println("->Medium :- It ranges between 1 to 50.");
		System.out.println("->Hard :- It ranges between 1 to 100.");
		System.out.println("->Expert :- It ranges between 1 to 1000.");
		System.out.println("->Your guesses are being counted.");
		System.out.println("->Faster you predict faster you win.");
		System.out.println("\n*SELECT MODE*");
		System.out.println("1)Easy");
		System.out.println("2)Medium");
		System.out.println("3)Hard");
		System.out.println("4)Expert");
		System.out.print("\nEnter Your Choiced Mode:-");
		int mode=input.nextInt();
		System.out.print("\nEnter Your Name:-");
		String name=string_in.nextLine();
		switch(mode)
		{
			case 1:
				secretNo=new Random().nextInt(20);
				break;
			case 2:
				secretNo=new Random().nextInt(50);
				break;
			case 3:
				secretNo=new Random().nextInt(100);
				break;
			case 4:
				secretNo=new Random().nextInt(1000);
				break;
			default:
				System.out.println("Invalid Mode");
		}
		System.out.println("\nLets Get Started "+name+"!");
		//System.out.println(secretNo);
		while(guess!=secretNo)
		{
			System.out.print("\nEnter Your Guessed No:-");
			guess=input.nextInt();
			noOfGuess++;
			if(guess<secretNo)
			{
				System.out.println("Too Low "+name+", Try Again.");
			}
			else if(guess>secretNo)
			{
				System.out.println("Too High "+name+", Try Again.");
			}
		}
		System.out.println("\nHooray! "+name+", You Discovered Secret Number="+secretNo);
		System.out.println("In "+noOfGuess+" Guesses");
		System.out.println("\nThank You For Playing With Us :)");
		//Credits
		System.out.println("\nThis Game Is Developed By Visu1307");
		System.out.println("On 22nd  Januaray, 2023");
		System.out.println("Under The Guidance Of Chirag Sir");
		System.out.println("Reference :- ChatGPT and FreeCodeCamp");
	}
}