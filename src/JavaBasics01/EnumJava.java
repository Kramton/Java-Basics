package JavaBasics01;

// can be placed outside or inside of the class.
enum Level
{
	// all caps for good practice.
	LOW, MEDIUM, HIGH;
}

public class EnumJava {
	
	enum Weeks
	{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}

	public static void main(String[] args) {

		Level l = Level.LOW;

		System.out.println(l);
		
		Weeks day = Weeks.FRIDAY;
		
		System.out.println(day);
	}

}