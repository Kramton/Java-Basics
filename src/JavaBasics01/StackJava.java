package JavaBasics01;

import java.util.Stack;

public class StackJava 
{
	public static void main(String[] args) 
	{
		Stack<String> games = new Stack<String>();
		games.add("Call Of Duty");
		games.add("Terraria");
		games.add("Overwatch");
		
		System.out.println(games.pop()); // takes off the last added string variable.
		
		System.out.println(games);
	}
}