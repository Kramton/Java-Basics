package JavaBasics01;

public class NestedForLoops 
{
	public static void main(String[] args) 
	{
		String[] colors = {"Red", "Green", "Blue"};
		
		for(int i = 0; i < colors.length; i++)
		{
			System.out.println("Colors: " + colors[i]);
		}
		
		String[][] fancyColors = {{"Red", "Green", "Blue"}, {"Violet", "Cyan", "Magenta"}};
		
		for(int rows = 0; rows < fancyColors.length; rows++)
		{
			for(int column = 0; column < 3; column++)
			{
				System.out.println(fancyColors[rows][column]);
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 10; j++)
			{
				System.out.println("i: " + i + ", j: " + j);
			}
		}
	}
}