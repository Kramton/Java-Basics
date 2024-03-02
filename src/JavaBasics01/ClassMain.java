package JavaBasics01;

public class ClassMain 
{
	public static void main(String[] args)
	{
		Class1 c = new Class1();
		Class1 d = new Class1();
		Class2 e = new Class2();
		
		System.out.println(c.chars);
		System.out.println(d.x);
		
		c.printHi();
		d.printHi();
		
		System.out.println(e.y);
	}
}