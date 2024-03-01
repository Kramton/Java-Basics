package JavaBasics01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJava 
{
	public static void main(String[] args) 
	{
		LinkedList<String> linky = new LinkedList<String>();
		
		linky.add("Hello");
		linky.add("Planet");
		linky.add("Earth");
		
		System.out.println(linky);
		
		System.out.println(linky.getFirst() + " " + linky.get(1));
		
		// to get specific element
		Iterator it = linky.iterator();
		while(it.hasNext())
		{
			if(it.next() == "Planet")
			{
				System.out.println("got planet");
			}
		}
	}
}