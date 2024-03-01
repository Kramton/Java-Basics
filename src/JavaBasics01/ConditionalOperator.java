package JavaBasics01;

public class ConditionalOperator 
{
	public static void main(String[] args) 
	{
		int a1 = (7 > 3) ? 7 : 3; // this is the conditional operator
		
		int a2;
		
		// it is the same as the code below.
		if(7 > 3)
		{
			a2 = 7;
		}
		else
		{
			a2 = 3;
		}
		
		System.out.println(a1);
		System.out.println(a2);
		
		String s = "hello";
		
		//						     What ? True : False 
		double result = s.equals("hello") ? 0.52 : 0.25; // if what equals then print true, otherwise false.
		
		System.out.println(result);
	}
}