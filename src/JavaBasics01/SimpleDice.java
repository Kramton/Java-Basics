package JavaBasics01;

import java.util.Random;

public class SimpleDice 
{
	public static void main(String[] args) 
	{
		Random randNumber = new Random();
		int dice = randNumber.nextInt(6) + 1;
		
		System.out.println("You rolled: " + dice);
	}
}