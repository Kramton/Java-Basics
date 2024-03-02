package JavaBasics01;

public class OOPPen 
{
	// an object has attributes as shown below:
	String type = "gel";
	String colour = "blue";
	int point = 10;
	
	static boolean clicked = false;
	
	// as well as actions as shown below:
	public static void click()
	{
		clicked = true;
	}
	
	public static void unclick()
	{
		clicked = false;
	}
}