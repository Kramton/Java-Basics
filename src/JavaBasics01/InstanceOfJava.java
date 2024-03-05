package JavaBasics01;

public class InstanceOfJava 
{
	public static void main(String[] args) 
	{
		InstanceOfJava o = new InstanceOfJava();
		
		// instanceof checks if the right side is a: class, subclass, or interface of the left side.
		System.out.println(o instanceof InstanceOfJava); // outputs true.
		
		Eagle e = new Eagle();
		System.out.println(e instanceof Eagle);
		
		e = null;
		
		System.out.println(e instanceof Bird); // outputs false because it's null.
	}
}

class Bird
{
	public void sing()
	{
		System.out.println("Sings.");
	}
}

class Eagle extends Bird
{
	
}