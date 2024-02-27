package JavaBasics01;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		int day = 3;
		
		switch(day)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid answer");
				break;
		}
		
		String month = "Jadfggdfgfdn";
		
		switch(month)
		{
			case "Jan":
				System.out.println("1");
				break;
			case "Feb":
				System.out.println("2");
				break;
			case "Mar":
				System.out.println("3");
				break;
			case "Apr":
				System.out.println("4");
				break;
			case "May":
				System.out.println("5");
				break;
			case "Jun":
				System.out.println("6");
				break;
			case "Jul":
				System.out.println("7");
				break;
			case "Aug":
				System.out.println("8");
				break;
			case "Sep":
				System.out.println("9");
				break;
			case "Oct":
				System.out.println("10");
				break;
			case "Nov":
				System.out.println("11");
				break;
			case "Dec":
				System.out.println("12");
				break;
			default:
				System.out.println("Invalid answer...");
				
		}
	}
}