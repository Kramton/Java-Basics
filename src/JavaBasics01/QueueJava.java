package JavaBasics01;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava 
{
	public static void main(String[] args) 
	{
		Queue<String> line = new LinkedList<String>();
		line.add("John");
		line.add("Tyrone");
		line.add("Yuzu");
		
		System.out.println(line);
		
		String t = line.poll(); // takes out the first in line.
		System.out.println(t);
		
		System.out.println(line);
	}
}