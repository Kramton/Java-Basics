package JavaBasics01;

public class CapitalProgram 
{
	public static void main(String[] args) 
	{
		String s = "happy birthday";
		
		System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
	}
}