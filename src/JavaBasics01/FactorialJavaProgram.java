package JavaBasics01;

public class FactorialJavaProgram 
{
	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			System.out.println(n);
			return n * factorial(n - 1);
		}
	}
}