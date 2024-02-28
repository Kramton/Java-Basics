package JavaBasics01;

import java.util.ArrayList;

public class ForEachJava 
{
	public static void main(String[] args) 
	{
		String[] cars = {"BMW", "Tesla", "Ferrari"};
		
		for(String car : cars)
		{
			System.out.println(car);
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(6);
		numbers.add(29);
		
		for(int a : numbers)
		{
			System.out.println(a);
		}
	}
}