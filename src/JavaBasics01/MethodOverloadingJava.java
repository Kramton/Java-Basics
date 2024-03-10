package JavaBasics01;

import java.util.Random;

public class MethodOverloadingJava 
{
	public static void main(String[] args) 
	{
		System.out.println(addNumbers(3, 9));
		System.out.println(addNumbers(5.5, 2.9));
		System.out.println(addNumbers(4, 9, 1));
		addNumbers();
	}
	
	// this is method overloading, you can have the same method names because java knows
	// that they're different method values (one is an integer the other is double).
	public static int addNumbers(int a, int b)
	{
		return a + b;
	}
	
	public static double addNumbers(double a, double b)
	{
		return a + b;
	}
	
	public static int addNumbers(int a, int b, int c)
	{
		return a + b + c;
	}
	
	public static void addNumbers()
	{
		Random r = new Random();
		System.out.println(r.nextInt(6) + r.nextInt(6));
	}

}