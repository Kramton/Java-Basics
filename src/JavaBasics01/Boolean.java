package JavaBasics01;

public class Boolean 
{
	public static void main(String[] args)
	{
		boolean loop = true;
		
		System.out.println("Before: " + loop);
		
		loop = false;
		
		System.out.println("After: " + loop);
		
		int number = 0;
		
		boolean real = (number == 0);
		System.out.println(real +"\n"); // Prints true
		
		boolean pass = true;
		
		if(pass)
		{
			System.out.println("In the if statement.");
		}
		
		int num1 = 1;
		int num2 = 3;
		
		boolean numTrue = ((num1 + num2) == 4);
		
		if(numTrue)
		{
			System.out.println("Wow!");
		}
		else
		{
			System.out.println("No...");
		}
	}
}