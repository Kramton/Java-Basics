package JavaBasics01;

public class StudentEncapsulationJava 
{
	private String name;
	int age;
	
	// encapsulation is creating a get and set method.
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public int getAge()
	{
		return age;
	}
}