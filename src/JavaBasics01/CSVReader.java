package JavaBasics01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader
{
	public static void main(String[] args) 
	{
		// CSV stands for Comma separated values.
		
		String path = "/Users/mark/Documents/GitHub/Learning-Java/cp-national-datafile-csv_2021.csv";
		String line = "";
		
		try 
		{
			FileReader file = new FileReader(path);
			BufferedReader br = new BufferedReader(file);
			
			while((line = br.readLine()) != null)
			{
//				System.out.println(line);
//				break;
				
				String[] values = line.split(",");
				System.out.println("Year: " + values[1] + " Estimate: " + values[3]);
;			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}