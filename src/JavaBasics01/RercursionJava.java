package JavaBasics01;

public class RercursionJava 
{
	public static void main(String[] args) 
	{
		printHi(5);
		countBackwards(10);
	}
	
	public static void printHi(int n)
	{
		if(n == 0)
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println("Hi");
			n--;
			printHi(n);
		}
	}
	
	public static void countBackwards(int n)
	{
		if(n == 0)
		{
			System.out.println("Done");
		}
		else
		{
			System.out.println(n);
			n--;
			countBackwards(n);
		}
	}
}