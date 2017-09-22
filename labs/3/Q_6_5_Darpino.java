import java.util.Arrays;
import java.util.Scanner;

public class Q_6_5_Darpino {

	public static void main(String[] args) {

		//create Scanner
		Scanner input = new Scanner(System.in); 

		// user input: enter three numbers
		System.out.print("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		//display sorted numbers in increasing order
		displaySortedNumbers(number1, number2, number3);

	}

	//create method 
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		//create temporary spot for values to swap
		double temp;

		//if statement to sort numbers in increasing order
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//display results
		System.out.println(" " + num1 + " " + num2 + " " + num3 + " ");
	}
}
