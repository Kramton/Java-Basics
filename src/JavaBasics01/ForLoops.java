package JavaBasics01;

public class ForLoops 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		int[] grades = {98, 100, 87, 70, 60};
		
		for(int i = 0; i < grades.length; i++)
		{
			System.out.println(grades[i]);
		}
	}
}