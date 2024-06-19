import java.util.*;
class PastLives
{
	public static void main(String args[])
	{	
		Scanner input=new Scanner(System.in);
		Scanner reader=new Scanner(System.in);
		System.out.println("	\n\n			::Who Were You In Your Past Life?::");
		System.out.println("\n*INSTRUCTIONS*");
		System.out.println("->Give answer to 10 simple questions");
		System.out.println("->There will be 5 options like:- a,b,c,d,e");
		System.out.println("->In answer only one character i.e option is allowed");
		System.out.println("->It will test your instincts and at last you will get your answer");
		
		System.out.print("\nReady to play(y/n):-");
		String ready=reader.nextLine();
		if(ready.equals("y"))
		{
			System.out.println("\nLet's Get Started");
			int ans=0;
			//First Question
			System.out.println("\n[Q.1] When you look back, what do you tend to remember most?");
			System.out.println("a)Family memories");
			System.out.println("b)Funny moments");
			System.out.println("c)School years");
			System.out.println("d)Trips and adventures");
			System.out.println("e)Accomplishments");
			System.out.print("\nEnter your chosen option:-");
			String opt1=reader.nextLine();
			if(opt1.equals("a"))
			{
				ans=ans+50;
			}
			else if(opt1.equals("b"))
			{
				ans=ans+10;
			}
			else if(opt1.equals("c"))
			{
				ans=ans+40;
			}
			else if(opt1.equals("d"))
			{
				ans=ans+30;
			}
			else
			{
				ans=ans+20;
			}

			//Second Question
			System.out.println("\n[Q.2]You feel more related to...");
			System.out.println("a)Dolphin");
			System.out.println("b)Butterfly");
			System.out.println("c)Wolf");
			System.out.println("d)Cheetah");
			System.out.println("e)Swallow");
			System.out.print("\nEnter your chosen option:-");
			String opt2=reader.nextLine();
			if(opt2.equals("a"))
			{
				ans=ans+40;
			}
			else if(opt2.equals("b"))
			{
				ans=ans+10;
			}
			else if(opt2.equals("c"))
			{
				ans=ans+50;
			}
			else if(opt2.equals("d"))
			{
				ans=ans+20;
			}
			else
			{
				ans=ans+30;
			}
			
			//Third Question
			System.out.println("\n[Q.3]You have an appetite for:");
			System.out.println("a)Knowledge");
			System.out.println("b)Truth and justice");
			System.out.println("c)Artistic expressions");
			System.out.println("d)Adventure");
			System.out.println("e)Self-improvement");
			System.out.print("\nEnter your chosen option:-");
			String opt3=reader.nextLine();
			if(opt3.equals("a"))
			{
				ans=ans+40;
			}
			else if(opt3.equals("b"))
			{
				ans=ans+50;
			}
			else if(opt3.equals("c"))
			{
				ans=ans+10;
			}
			else if(opt3.equals("d"))
			{
				ans=ans+30;
			}
			else
			{
				ans=ans+20;
			}

			//Fourth Question
			System.out.println("\n[Q.4]Your most remembered memory could be pretty similar to:");
			System.out.println("a)Going on a trip");
			System.out.println("b)Building or making something");
			System.out.println("c)A birthday party");
			System.out.println("d)Playing outside");
			System.out.println("e)Playing with my pet or friends");
			System.out.print("\nEnter your chosen option:-");
			String opt4=reader.nextLine();
			if(opt4.equals("a"))
			{
				ans=ans+30;
			}
			else if(opt4.equals("b"))
			{
				ans=ans+40;
			}
			else if(opt4.equals("c"))
			{
				ans=ans+10;
			}
			else if(opt4.equals("d"))
			{
				ans=ans+20;
			}
			else
			{
				ans=ans+50;
			}

			//Fifth Question
			System.out.println("\n[Q.5]Choose an icon:");
			System.out.println("a)Nicola Tesla");
			System.out.println("b)Albert Einstein");
			System.out.println("c)Stephen Hawkings");
			System.out.println("d)Elizabeth II");
			System.out.println("e)Neil Armstrong");
			System.out.print("\nEnter your chosen option:-");
			String opt5=reader.nextLine();	
			if(opt5.equals("a"))
			{
				ans=ans+10;
			}
			else if(opt5.equals("b"))
			{
				ans=ans+40;
			}
			else if(opt5.equals("c"))
			{
				ans=ans+20;
			}
			else if(opt5.equals("d"))
			{
				ans=ans+50;
			}
			else
			{
				ans=ans+30;
			}
	
			//Sixth Question
			System.out.println("\n[Q.6]Pick a TV channel:");
			System.out.println("a)HBO");
			System.out.println("b)CNN");
			System.out.println("c)NAT GEO WILD");
			System.out.println("d)ESPN");
			System.out.println("e)DISCOVERY");
			System.out.print("\nEnter your chosen option:-");
			String opt6=reader.nextLine();
			if(opt6.equals("a"))
			{
				ans=ans+10;
			}
			else if(opt6.equals("b"))
			{
				ans=ans+50;
			}
			else if(opt6.equals("c"))
			{
				ans=ans+30;
			}
			else if(opt6.equals("d"))
			{
				ans=ans+20;
			}
			else
			{
				ans=ans+40;
			}

			//Seventh Question
			System.out.println("\n[Q.7]When do you most often experience deja vu?");
			System.out.println("a)When making an important decision");
			System.out.println("b)When i met new people");
			System.out.println("c)When i go to new places");
			System.out.println("d)When i walk/run");
			System.out.println("e)When I'm arguing");
			System.out.println("f)Other/I don't know deja vu");
			System.out.print("\nEnter your chosen option:-");
			String opt7=reader.nextLine();
			if(opt7.equals("a"))
			{
				ans=ans+40;
			}
			else if(opt7.equals("b"))
			{
				ans=ans+10;
			}
			else if(opt7.equals("c"))
			{
				ans=ans+30;
			}
			else if(opt7.equals("d"))
			{
				ans=ans+20;
			}
			else if(opt7.equals("e"))
			{
				ans=ans+50;
			}
			else
			{
				ans=ans+0;
			}

			//Eighth Question
			System.out.println("\n[Q.8]If you could, you'd totally want to be a professional:");
			System.out.println("a)Athlete");
			System.out.println("b)Scientist");
			System.out.println("c)Photographer");
			System.out.println("d)Actress/Actor");
			System.out.println("e)Doctor");
			System.out.print("\nEnter your chosen option:-");
			String opt8=reader.nextLine();
			if(opt8.equals("a"))
			{
				ans=ans+20;
			}
			else if(opt8.equals("b"))
			{
				ans=ans+40;
			}
			else if(opt8.equals("c"))
			{
				ans=ans+30;
			}
			else if(opt8.equals("d"))
			{
				ans=ans+10;
			}
			else
			{
				ans=ans+50;
			}

			//Ninth Question
			System.out.println("\n[Q.9]What would you say is your family role?");
			System.out.println("a)The go-getter");
			System.out.println("b)The princess/prince");
			System.out.println("c)The caretaker");
			System.out.println("d)The curious spirit");
			System.out.println("e)The intellectual");
			System.out.print("\nEnter your chosen option:-");
			String opt9=reader.nextLine();
			if(opt9.equals("a"))
			{
				ans=ans+20;
			}
			else if(opt9.equals("b"))
			{
				ans=ans+10;
			}
			else if(opt9.equals("c"))
			{
				ans=ans+50;
			}
			else if(opt9.equals("d"))
			{
				ans=ans+30;
			}
			else
			{
				ans=ans+40;
			}

			//Tenth Question
			System.out.println("\n[Q.10]Pick a hobby:");
			System.out.println("a)Reading");
			System.out.println("b)Sports");
			System.out.println("c)Volunteering");
			System.out.println("d)Does partying count ;) ");
			System.out.println("e)I have a lot! / Other");
			System.out.print("\nEnter your chosen option:-");
			String opt10=reader.nextLine();
			if(opt10.equals("a"))
			{
				ans=ans+40;
			}
			else if(opt10.equals("b"))
			{
				ans=ans+20;
			}
			else if(opt10.equals("c"))
			{
				ans=ans+50;
			}
			else if(opt10.equals("d"))
			{
				ans=ans+10;
			}
			else
			{
				ans=ans+30;
			}
			
			//Results
			if(ans<180)
			{
				System.out.println("\nAccording to our prediction you are Movie Star in your past lives");
			}
			else if(ans>180 && ans<260)
			{
				System.out.println("\nAccording to our prediction you are Elite Athlete in your past lives");
			}
			else if(ans>270 && ans<350)
			{
				System.out.println("\nAccording to our prediction you are Globetrotter (A person who travelled many countries) in your past lives");
			}
			else if(ans>360 && ans<440)
			{
				System.out.println("\nAccording to our prediction you are an Inventor in your past lives");
			}
			else
			{
				System.out.println("\nAccording to our prediction you are an Warriror in your past lives");
			}

			//Credits
			System.out.println("\nDon't let your past dictate who you are, but let it be lesson that strengthens the person you will become");
			System.out.println("Live in present and Be happy!  :) ");
			System.out.println("\nThank you for playing with us.");
			System.out.println("Developed by:-Visu1307");
			System.out.println("Reference by YouTube channel Mister Test");
		}
		else
		{
			System.out.println("Sorry, you are not fit yet to play this game");
		}
	}
}