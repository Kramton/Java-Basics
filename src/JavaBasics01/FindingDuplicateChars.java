package JavaBasics01;

public class FindingDuplicateChars 
{
	public static void main(String[] args) 
	{
		String sentence = "How many dupes are there?";
		String characters = "";
		String dupes = "";
		
		System.out.println(sentence);
		
		for(int i = 0; i < sentence.length(); i++)
		{
			String current = Character.toString(sentence.charAt(i));
			
			if(characters.contains(current))
			{
				if(!dupes.contains(current))
				{
					dupes += current + ",";
				}
			}
			characters += current;
		}
		System.out.println(dupes);
	}
}