package JavaBasics01;

public class TwoDimensionArrays 
{
	public static void main(String[] args) 
	{
		// Arrays go in [row][column]
		// 1st method for a 2d array
		int[][] lotteryCard = {{12, 42, 38}, {4, 3, 90}, {87, 32, 15}};
		
		// 2nd method for a 2d array
		int[][] lotteryCard2 = new int[3][3];
		
		// (but this one you have to manually type it out like this)
		lotteryCard2[0][0] = 23;
		lotteryCard2[0][1] = 3;
		lotteryCard2[0][2] = 65;
		lotteryCard2[1][0] = 76;
		lotteryCard2[1][1] = 12;
		lotteryCard2[1][2] = 90;
		lotteryCard2[2][0] = 56;
		lotteryCard2[2][1] = 72;
		lotteryCard2[2][2] = 1;
		
		// System.out.println(lotteryCard[0][0]); // outputs 12
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.println(lotteryCard[i][j]);
			}
			System.out.println();
		}
	}
}