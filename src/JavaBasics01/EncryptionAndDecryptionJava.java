package JavaBasics01;

import java.util.ArrayList;

public class EncryptionAndDecryptionJava 
{
	public static void main(String[] args) 
	{
		String text = "Hello World!";
		int key = 5;
		
		char[] chars = text.toCharArray();
		
		ArrayList<Character> decrypt = new ArrayList<Character>();
		
		for(char l : chars)
		{
			decrypt.add(l);
			l += key;
			System.out.print(l);
		}
		
		System.out.println();
		
		for(char d : decrypt)
		{
			System.out.print(d);
		}
	}
}