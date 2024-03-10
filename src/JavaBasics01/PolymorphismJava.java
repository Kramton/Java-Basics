package JavaBasics01;

class Bird1
{
	public void sing()
	{
		System.out.println("Tweet tweet tweet");
	}
}

class Robin extends Bird1
{
	public void sing()
	{
		System.out.println("Twiddle Twiddle Twiddle");
	}
}

class Pelican extends Robin
{
	public void sing()
	{
		System.out.println("too too too");
	}
}


public class PolymorphismJava 
{
	public static void main(String[] args) 
	{
		Bird1 b = new Robin();
		b.sing();
		
		Pelican p = new Pelican();
		p.sing();
	}
}