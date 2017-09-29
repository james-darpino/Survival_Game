import java.util.Scanner;

public class Q_6_19_Darpino {

	public static void main(String[] args) {
		//create Scanner 
		Scanner input = new Scanner(System.in); 

		//user input: enter 3 sides of a triangle 
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		// display result 
		System.out.println(isValid(side1, side2, side3) ? 
				"The area of the triangle is " + area(side1, side2, side3) :
				"Input is invalid");
	}

	//new method isValid to check if the sum of 2 sides of the triangle is greater than the third
	public static boolean isValid(
			double side1, double side2, double side3) {
		boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;

		return valid;
	}

	//new method area returns the area of the triangle
	public static double area(
			double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

	}

}
