package JavaBasics01;

class Outside
{
	int a = 0;
	
	class Inside
	{
		int b = 5;
	}
}

public class InnerClassJava 
{
	public static void main(String[] args) 
	{
		Outside o = new Outside();
		Outside.Inside i = o.new Inside();
		
		System.out.println(o.a + " " + i.b);
	}
}