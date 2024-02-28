package JavaBasics01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FilesInJava 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		try 
		{
			File myObj = new File("filename.txt");
			Scanner scan = new Scanner(myObj);
			
		    if (myObj.createNewFile()) 
		    {
		        System.out.println("File created: " + myObj.getName());
		    } 
		    else 
		    {
		        System.out.println("File already exists.");
		    }
		    
			System.out.println(scan.nextLine());
		} 
		catch (IOException e) 
		{
			System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}
}