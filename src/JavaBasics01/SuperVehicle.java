package JavaBasics01;

public class SuperVehicle 
{
	int maxSpeed;
	
	SuperVehicle()
	{
		System.out.println("Vehicle constructor");
	}
	
	SuperVehicle(int maxSpeed)
	{
		System.out.println("Vehicle constructor with speed");
		// 'this' refers to the class it's in.
		this.maxSpeed = maxSpeed;
	}
	
	public void vroom()
	{
		System.out.println("Vroom vroom");
	}
}

class Car extends SuperVehicle
{
	int maxSpeed = 100;
	
	// this is a constructor.
//	Car()
//	{
//		System.out.println("Car contructor.");
//	}
	
	Car()
	{
		// refers to the parent class
		// it also has to be on the top of whatever. Otherwise it won't work.
		super();
		
		System.out.println("Car constructor");
	}
	
	public void vroom()
	{
		// super lets us use the parent class' methods
		super.vroom();
	}
	
	public void display()
	{
		System.out.println(maxSpeed);
	}
}