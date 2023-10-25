package JavaBasics01;

import java.util.Scanner;

public class StringInput 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter pokemon 1: ");
		String pokemon1 = scan.nextLine();
		
		System.out.print("Enter pokemon 2: ");
		String pokemon2 = scan.nextLine();
		
		System.out.print("Enter pokemon 3: ");
		String pokemon3 = scan.nextLine();
		
		System.out.println("Your pokemon party:");
		System.out.println("1st slot in your party: " + pokemon1);
		System.out.println("2nd slot in your party: " + pokemon2);
		System.out.println("3rd slot in your party: " + pokemon3);
	}
}