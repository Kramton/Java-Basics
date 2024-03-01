package JavaBasics01;

public class StringToInteger 
{
	public static void main(String[] args) 
	{
		String word1 = "64";
		int num1 = Integer.parseInt(word1);
		
		System.out.println(num1 + 7);
		
		int num2 = 9;
		String word2 = Integer.toString(num2);
		
		System.out.println(word2 + 5);
		
		String sentence = "You are 21 years old.";
		sentence = sentence.replaceAll("\\D+", "");
		System.out.println(sentence);
		
		int replace = Integer.parseInt(sentence);
		System.out.println(replace + 2);
	}
}