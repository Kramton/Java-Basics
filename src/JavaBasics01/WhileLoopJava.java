package JavaBasics01;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopJava 
{
	public static void main(String[] args) 
	{
		int a = 0;
		
		while(a < 10)
		{
			System.out.println("Hi");
			break;
			//a++;
		}
		
		do
		{
			System.out.println("a");
		}
		while(false); // "while" its true, "do" the code.
		
		String sentence = "Being an adult is sometimes fun.";
		
		Scanner scan = new Scanner(sentence);
		
		ArrayList<String> words = new ArrayList<String>();
		
		while(scan.hasNext())
		{
			words.add(scan.next());
		}
		
		System.out.println(words);
	}
}