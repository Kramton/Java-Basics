package JavaBasics01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTIme 
{
	public static void main(String[] args) 
	{
		Date currentDate = new Date();
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(currentDate));
		
		SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE");
		System.out.println(dayOfWeek.format(currentDate));
		
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mma");
		System.out.println(clockFormat.format(currentDate));
	}
}