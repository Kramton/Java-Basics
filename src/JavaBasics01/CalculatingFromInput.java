package JavaBasics01;

import java.util.Scanner;

public class CalculatingFromInput 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number: ");
		int number2 = scan.nextInt();
		
		System.out.println("Result: " + (number1 + number2));
	}
}