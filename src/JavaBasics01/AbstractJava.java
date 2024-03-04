package JavaBasics01;

abstract class Dog
{
	public void bark()
	{
		System.out.println("Bark");
	}
	
	public abstract void poop();
}

class Chihuahua extends Dog
{
	@Override
	public void poop() 
	{
		System.out.println("Pooped");
	}
}

public class AbstractJava 
{
	public static void main(String[] args) 
	{
		Chihuahua c = new Chihuahua();
		c.bark();
		c.poop();
	}
}
