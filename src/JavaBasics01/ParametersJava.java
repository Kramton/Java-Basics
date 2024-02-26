package JavaBasics01;

public class ParametersJava 
{
	public static void main(String[] args) 
	{
		saySomething("John Doe\n\n"); // This is a method => saySomething("This is called the Argument")
		
		info("Timmy", 19);
		
		System.out.println("\n\n" + add(4, 5));
	}
	
	public static void saySomething(String s)
	{
		System.out.println(s);
	}
	
	public static void info(String name, int age)
	{
		System.out.println("Name: " + name + "\nAge: " + age);
	}
	
	public static int add(int x, int y)
	{
		return x + y;
	}
}