import java.util.Scanner;

public class Q_9_11_Darpino {

	public static void main(String[] args) {
		//create a Scanner 
		Scanner input = new Scanner(System.in);



		//user input 
		System.out.println("Enter a: ");
		double a = input.nextDouble();

		System.out.println("Enter b: ");
		double b = input.nextDouble();

		System.out.println("Enter c: ");
		double c = input.nextDouble();

		System.out.println("Enter d: ");
		double d = input.nextDouble();

		System.out.println("Enter e: ");
		double e = input.nextDouble();

		System.out.println("Enter f: ");
		double f = input.nextDouble();

		//call LinearEquation
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);


		//display results
		if (linearEquation.isSolvable()) {
			System.out.println("x is " + linearEquation.getX() +
					" and y is " + linearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");


	}

}
