package JavaBasics01;

public class MethodOverridingDog {
	
	int avgSize = 20;
	
	public void bark()
	{
		System.out.println("Bark!");
	}
	
	public void poop()
	{
		System.out.println("Pooping");
	}
	
	public int averageSize()
	{
		return avgSize;
	}
}
