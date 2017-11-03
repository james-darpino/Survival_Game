import java.util.Scanner;

public class Q_11_1_Darpino {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.println("Enter side 1: ");
		double s1 = input.nextDouble();
		System.out.println("Enter side 2: ");
		double s2 = input.nextDouble();
		System.out.println("Enter side 3: ");
		double s3 = input.nextDouble();
		
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		System.out.println("Is the triangle filled? (Answer with either true or false) ");
		boolean filled = input.nextBoolean();

		//call object triangle 
		Triangle triangle = new Triangle(s1, s2, s3, color, filled);
		
		//call set color 
		triangle.setColor(color);
		
		//call get filled
		triangle.setFilled(filled);
		
		//test stuff
		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") + "filled");
	}

}
