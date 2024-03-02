package JavaBasics01;

public class ShirtMain {

	public static void main(String[] args) {
		Shirt s = new Shirt("Purple", 'M');
		s.putOn();
		s.takeOff();
		
		/*
		s.setColour("Purple");
		s.setSize('M');
		*/
		
		System.out.println(s.colour);
		System.out.println(s.size);
	}

}
