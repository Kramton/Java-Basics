package JavaBasics01;

public class Account
{
	String name;
	int age;
	
	public static void main(String[] args) 
	{
		Account a = new Account();
		a.setName("John");
		a.setAge(21);
		
		a.printDetails();
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void printDetails()
	{
		System.out.println("Name: " + getName() + "\nAge: " + getAge());
	}
}