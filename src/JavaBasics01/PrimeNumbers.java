package JavaBasics01;

import java.util.ArrayList;

public class PrimeNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println(findPrimes(1, 100));
	}
	
	public static ArrayList<Integer> findPrimes(int start, int end)
	{
		ArrayList<Integer> primeList = new ArrayList<Integer>();

		for(int index = start; index < end; index++)
		{
			boolean prime = true;
			
			int i  = 2;
			while(i <= index/2)
			{
				if(index % i == 0)
				{
					prime = false;
					break;
				}
				i++;
			}
			
			if(prime)
			{
				primeList.add(index);
			}
		}
		
		return primeList;
	}
}