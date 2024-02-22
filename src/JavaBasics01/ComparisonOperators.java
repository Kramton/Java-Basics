package JavaBasics01;

public class ComparisonOperators 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 4;
		
		boolean isTrue = (a == b); // is equal to
		System.out.println(isTrue); // false
		
		isTrue = (a <= b); // is less than or equal to
		System.out.println(isTrue); // false
		
		isTrue = (a >= b); // is greater than or equal to
		System.out.println(isTrue); // true
		
		isTrue = (a != b); // is not equal to
		System.out.println(isTrue); // true
		
		isTrue = (a < b); // is less than
		System.out.println(isTrue); // false
		
		isTrue = (a > b); // is greater than
		System.out.println(isTrue); // true
		
		double num = 2.4;
		
		if(a == 2.4)
		{
			System.out.println("They are equal.");
		}
		
		if(a > 7)
		{
			System.out.println("Greater than 7.");
		}
		
		if(a == 2.4 || a == 2.5) // the "||" is "or" operator.
		{
			System.out.println("The number is 2.4 or 2.5");
		}
		
		if(a >= 0 && a <= 100 && a != 90)
		{
			System.out.println("Number is in the range of 0 and 100");
		}
	}
}