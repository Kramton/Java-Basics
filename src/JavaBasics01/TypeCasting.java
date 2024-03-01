package JavaBasics01;

public class TypeCasting 
{
	public static void main(String[] args) 
	{
		// java will automatically cast up (from byte to double) but we will have to manually cast down.
		// byte a;
		// short b;
		// char c;
		// int d;
		// long e;
		// float f;
		// double g;
		
		// eg casting up
		byte a = 7;
		float f = a;
		System.out.println(f);
		
		// eg casting down
		double g = 210.43;
		int d = (int)g;
		System.out.println(d);
	}
}