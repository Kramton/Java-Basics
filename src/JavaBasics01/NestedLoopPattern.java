package JavaBasics01;

import java.util.Scanner;

public class NestedLoopPattern 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, how many stars would you like? ");
		int numStars = scan.nextInt();
		
		for(int i = 1; i <= numStars; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = numStars - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}