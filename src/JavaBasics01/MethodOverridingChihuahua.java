package JavaBasics01;

public class MethodOverridingChihuahua extends MethodOverridingDog{
	
	int avgSize = 10;
	
	public void bark()
	{
		System.out.println("Yip!");
	}
	
	public int averageSize()
	{
		return avgSize;
	}
}
