package JavaBasics01;

import java.util.Random;

public class LogicalOperators 
{
	public static void main(String[] args) 
	{
		// || or
		// && and
		// ! not
		
		boolean a = false || true || false;
		System.out.println(a);
		
		a = true && false;
		System.out.println(a);
		
		a = !(true && false);
		System.out.println(a);
		
		a = !(true || false);
		System.out.println(a);
		
		a = (3 > 4) || true;
		System.out.println(a);
	}
}