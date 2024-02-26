package JavaBasics01;

import java.util.Scanner;

public class MultipleChoiceProgram 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String[] answers = {"b", "a", "a"};
		String[] response = {"", "", ""};
		
		System.out.println("What is 9 * 4?");
		System.out.println("a) 27");
		System.out.println("b) 36");
		System.out.println("c) none of the above\n");
		
		System.out.println("What is the Capital of New Zealand?");
		System.out.println("a) Wellington");
		System.out.println("b) Auckland");
		System.out.println("c) Christchurch\n");
		
		System.out.println("In the Gregorian Calendar, which has the lowest days?");
		System.out.println("a) All of them.");
		System.out.println("b) February");
		System.out.println("c) September");
		
		response[0] = scan.next();
		response[1] = scan.next();
		response[2] = scan.next();
		
		int score = 0;
		
		for(int i = 0; i < 3; i++)
		{
			if(response[i].equalsIgnoreCase(answers[i])) 
			{
				score++;
			}
		}
		
		System.out.println("Score: " + score + "/3");
	}
}