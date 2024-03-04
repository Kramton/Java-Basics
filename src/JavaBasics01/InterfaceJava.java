package JavaBasics01;

interface WaterBottleInterface
{
	String colour = "Blue";
	
	
	void fillUp();
	void pourOut();
}

public class InterfaceJava implements WaterBottleInterface // need to have all the methods from the interface (WaterBottleInterface).)
{
	public static void main(String[] args) 
	{
		System.out.println(colour);
		
		InterfaceJava ex = new InterfaceJava();
		ex.fillUp();
		ex.pourOut();
	}

	@Override
	public void fillUp() 
	{
		System.out.println("It is filled.");
	}

	@Override
	public void pourOut() 
	{
		System.out.println("Poured out.");
	}
}