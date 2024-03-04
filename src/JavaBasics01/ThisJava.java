package JavaBasics01;

public class ThisJava 
{
	int a;
	int b;
	
	String food;
	char size;
	
	public void setFood(String food, char size)
	{
		this.food = food;
		this.size = size;
	}
	
	public void setData(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) 
	{
		ThisJava t = new ThisJava();
		t.setData(4, 3);
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.setFood("Burger", 'M');
		System.out.println(t.food);
		System.out.println(t.size);
	}
}