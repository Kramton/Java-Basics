package JavaBasics01;

import java.util.Scanner;

public class TryCatchJava 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your favourite number? ");
		
		try
		{
			int favNumber = scan.nextInt();
			System.out.println(favNumber);
			
			int[] a = {1};
			System.out.println(a[1]);
			
			int num = 5/0; // can't divide by zero.
		}
//		catch(NullPointerException e) // can use specific exception
//		{
//			System.out.println("Your array is null!");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Your index is out of bounds!");
//		}
		catch(Exception e)
		{
			System.out.println("Something else went wrong.");
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is in finally, this will always run!");
			scan.close(); // use this line for good practice.
		}
	}
}