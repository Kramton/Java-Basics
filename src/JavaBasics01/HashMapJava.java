package JavaBasics01;

import java.util.HashMap;

public class HashMapJava 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 4);
		happy.put("c", 21);
		
		System.out.println(happy.get("c"));
		
		HashMap<String, String> login = new HashMap<String, String>();
		login.put("JohnD7th", "LetMeIn");
		login.put("Nexus", "Network");
		login.put("LetMeSoloHer", "Melania");
		
		login.remove("Nexus");
		
		System.out.println(login);
		
		//.containsValue is the right side of the hash map
		//.containsKey is the left side of the hash map
		System.out.println(login.containsValue("LetMeIn")); // outputs true
		System.out.println(login.containsKey("JohnD7th"));
		System.out.println(login.replace("LetMeSoloHer", "BetterPassword"));
		System.out.println(login);
		
		System.out.println(login.get("JohnD7th"));
	}
}