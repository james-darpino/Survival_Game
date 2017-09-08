// Question 2.9
import java.util.Scanner;

public class Q2_9_darpino {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);

		// User input
		System.out.print("Enter v0, v1, and t:");
		double velocity0 = input.nextDouble();
		double velocity1 = input.nextDouble();
		double time = input.nextDouble();

		// Calculations 
		double acceleration = ((velocity1 - velocity0) / time);

		// Display results 
		System.out.println("The average acceleration is " + acceleration + " ");


	}

}
