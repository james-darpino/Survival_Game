// Question 2.5
import java.util.Scanner;

public class Q2_5_darpino {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		// Get user input
		System.out.print("Enter the subtotal and a gratuity rate:");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();

		// Calculate gratuity and total
		double calculateGratuity = (gratuity / 10); // calculateGratuity = subtotal * gratuity / 100;
		double total = (calculateGratuity + subtotal);

		// Display results 
		System.out.println("The gratuity is $" + calculateGratuity + " and total is $" + total + "" );
	}

}
