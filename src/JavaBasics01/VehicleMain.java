package JavaBasics01;

public class VehicleMain 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		
		c.display(); // outputs 100 because its not super. Not using the parent class method.
	}
}