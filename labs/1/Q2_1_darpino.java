//Question 2.1
import java.util.Scanner;

public class Q2_1_darpino {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);

		// Get temperature from user
		System.out.print("Enter a temperature in Celsius: ");
		double celsius = input.nextDouble();

		// Convert to Fahrenheit
		double fahrenheit = ((celsius * 9) / 5) + 32 ;
		System.out.println( + celsius + " Celsius is " +
				fahrenheit + " in Fahrenheit");

	}

}