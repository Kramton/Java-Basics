package JavaBasics01;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetsJava 
{
	public static void main(String[] args) 
	{
		HashSet<String> h =  new HashSet<String>();
		h.add("cat");
		h.add("dog");
		h.add("bird");
		
		System.out.println(h);
		
		h.remove("dog");
		
		System.out.println();
		System.out.println(h);
		System.out.println();
		System.out.println(h.size());
		System.out.println();
		System.out.println(h.contains("bird"));
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(12);
		numbers.add(41);
		numbers.add(91);
		
		System.out.println();
		
		Object[] n = numbers.toArray();
		System.out.println(n[1]); // doesn't display the second spot in the array?
		
		System.out.println();
		Iterator<Integer> it = numbers.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}