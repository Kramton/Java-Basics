package JavaBasics01;

public class Access2 
{
	public static void main(String[] args) 
	{
		Access1 a = new Access1();
		System.out.println("Default: ");
		System.out.println(a.hours);
		System.out.println(a.minutes);
		
		System.out.println("Public: ");
		System.out.println(a.num1);
		System.out.println(a.num2);
		
		System.out.println("Protected: ");
		System.out.println(a.num5);
		System.out.println(a.num6);
	}
}