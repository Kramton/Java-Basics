package JavaBasics01;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String name = "John Doe";
		
		System.out.println("Name in upper case: " + name.toUpperCase());
		System.out.println("Name in lower case: " + name.toLowerCase());
		System.out.println("Name first character: " + name.charAt(0));
		System.out.println("Name first character: " + name.length());
		System.out.println("Name first character: " + name.substring(4));
	}
}