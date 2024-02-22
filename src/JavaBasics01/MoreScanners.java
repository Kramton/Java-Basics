package JavaBasics01;

import java.util.Scanner;

public class MoreScanners 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What's your first name? ");
		String name = scan.nextLine();
		
		System.out.println("What's your age? ");
		int age = scan.nextInt();
		
		System.out.println("What's your senior quote? ");
		String quote = scan.next();
		quote += scan.nextLine();
		
		System.out.println("Your name is: " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Your quote is: " + quote);
	}
}