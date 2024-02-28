package JavaBasics01;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsJava 
{
	public static void main(String[] args) throws Exception
	{
		// throw new IOException(); // can manually throw exceptions.
		
		//write();
		
		arrayPractice(7);
	}
	
	public static void arrayPractice(int i) throws Exception
	{
		int a[] = new int[5];
		
		if(i > 5)
		{
			throw new ArrayIndexOutOfBoundsException("Index is too high.");
		}
	}
	
	public static void write() throws IOException
	{
		BufferedWriter w = new BufferedWriter (new FileWriter("file.txt"));
		w.write("Test");
	}
}