package JavaBasics01;

import java.util.ArrayList;

public class ArrayListJava 
{
	public static void main(String[] args) 
	{
		ArrayList fruitList = new ArrayList();
		
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Orange");
		fruitList.add("Pears");

		System.out.println(fruitList);
		
		fruitList.remove("Pears");
		fruitList.remove("Apple");
		
		System.out.println(fruitList);
		
		fruitList.clear();
		
		System.out.println(fruitList);
	}
}