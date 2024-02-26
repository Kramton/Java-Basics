package JavaBasics01;

public class ReturnStatements 
{
	public static void main(String[] args) 
	{
		printMessage();
		
		int sum = add(8, 3);
		System.out.println(sum);
		
		String shouting = caps("hello world");
		System.out.println(shouting);
		
		int[] awesomeArray = giveArray(21, 5, 7);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
	}
	
	public static void printMessage()
	{
		System.out.println("Hello");
	}
	
	public static int add(int a, int b) 
	{
		return a + b;
	}
	
	public static String caps(String s)
	{
		return s.toUpperCase();
	}
	
	public static int[] giveArray(int a, int b, int c)
	{
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		
		return array;
	}
}