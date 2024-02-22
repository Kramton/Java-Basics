package JavaBasics01;

import java.util.Random;
import java.util.Scanner;

public class EightBall 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Magic Eight Ball");
		System.out.println("Enter your question: ");
		
		scan.next();
		scan.close();
		
		Random rand = new Random();
		int randNum = rand.nextInt(5);
		
		if(randNum == 0)
		{
			System.out.println("As I see it, yes.");
		}
		else if(randNum == 1)
		{
			System.out.println("Signs point to yes.");
		}
		else if(randNum == 2)
		{
			System.out.println("Reply hazy, try again.");
		}
		else if(randNum == 3)
		{
			System.out.println("Don't count on it.");
		}
		else if(randNum == 4)
		{
			System.out.println("Outlook not so good.");
		}
	}
}