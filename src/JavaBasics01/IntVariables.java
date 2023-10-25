package JavaBasics01;

public class IntVariables 
{
	public static void main(String[] args)
	{
		// The min and max integer is -2,147,483,648 to 2,147,483,647
		int number1 = 14;
		int number2 = 7;
		
		System.out.println("First number: " + number1);
		System.out.println("Second number: " + number2 + "\n");
		
		System.out.println("Result (addition): " + (number1 + number2));
		System.out.println("Result (subtraction): " + (number1 - number2));
		System.out.println("Result (multiplication): " + (number1 * number2));
		System.out.println("Result (division): " + (number1 / number2));
	}
}