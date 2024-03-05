package JavaBasics01;


// Final value you can't change it's value.
public class FinalMain 
{
	final int MIN = 0;
	final int MAX; // you have to initialize in a constructor otherwise it gives us an error.
	static final double PI = 3.14159;
	
	public static void main(String[] args) 
	{
		FinalMain f = new FinalMain();
		f.sayHi();
	}
	
	FinalMain()
	{
		MAX = 5;
	}
	
	final public void sayHi()
	{
		System.out.println("Hi!");
	}
}

class OtherClass extends FinalMain
{
	// cannot ovveride because its final.
//	public void sayHi()
//	{
//		System.out.println("Hello!");
//	}
}