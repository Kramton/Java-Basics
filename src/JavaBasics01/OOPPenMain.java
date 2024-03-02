package JavaBasics01;

public class OOPPenMain 
{
	public static void main(String[] args) 
	{
		System.out.println("--------Pen--------");
		OOPPen p = new OOPPen();
		System.out.println(p.colour);
		System.out.println(p.point);
		System.out.println(p.type);
		System.out.println(p.clicked);
		
		p.click();
		
		System.out.println(p.clicked);
		
		System.out.println("--------Headphones--------");
		OOPHeadPhones h = new OOPHeadPhones();
		System.out.println(h.charge);
		System.out.println(h.colour);
		System.out.println(h.power);
		System.out.println(h.volume);
		
		h.volumeUp();
		System.out.println(h.volume);
	}
}