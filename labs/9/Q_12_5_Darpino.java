import java.util.Scanner;

public class Q_12_5_Darpino {

	public static void main(String[] args) {
		// scanner 
		Scanner input = new Scanner(System.in);


		//tries input and if valid will work like normal
		try {
			System.out.println("input side 1: ");
			double side1 = input.nextDouble();

			System.out.println("");

			System.out.println("input side 2: ");
			double side2 = input.nextDouble();

			System.out.println("");

			System.out.println("input side 3: ");
			double side3 = input.nextDouble();

			Triangle triangle = new Triangle(side1, side2, side3);

			System.out.println("Area: " + triangle.getArea());
			System.out.println("Perimeter: " + triangle.getPerimeter());

			//when input fails try, this will input an error message to the user
		} catch (IllegalTriangleException ex) {
			System.out.println("Cannot use those sides. Please insert new sides.");
		}
	}

}
