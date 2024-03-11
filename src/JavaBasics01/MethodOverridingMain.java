package JavaBasics01;

public class MethodOverridingMain {

	public static void main(String[] args) {

		MethodOverridingDog d = new MethodOverridingDog();
		d.bark();
		System.out.println(d.averageSize());
		
		MethodOverridingChihuahua c = new MethodOverridingChihuahua();
		c.bark();
		c.poop();
		
		MethodOverridingDog d2 = new MethodOverridingChihuahua();
		d2.bark();
		
		System.out.println(d2.averageSize());
		
	}

}
