
public class Q_13_9_Darpino {

	public static void main(String[] args) {
		//create circles with a set radius
		Circle circle1 = new Circle(7);
		Circle circle2 = new Circle(5);
		Circle circle3 = new Circle(7);

		//give circles a color
		circle1.setColor("blue");
		circle2.setColor("red");
		circle3.setColor("blue");

		//determine if circled are filled
		circle1.setFilled(false);
		circle2.setFilled(true);
		circle3.setFilled(false);



		// Display results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());



		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") +
				"equal to circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
				"equal to circle3");
	}

}
