package JavaBasics01;

public class ToStringStudent 
{
	int id;
	String name;
	
	public ToStringStudent(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "ID: " + id + ", Name: " + name; 
	}
}