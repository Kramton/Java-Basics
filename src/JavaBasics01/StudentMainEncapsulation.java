package JavaBasics01;

public class StudentMainEncapsulation 
{
	public static void main(String[] args) 
	{
		StudentEncapsulationJava s = new StudentEncapsulationJava();
		s.setName("John");
		s.setAge(21);
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
	}
}