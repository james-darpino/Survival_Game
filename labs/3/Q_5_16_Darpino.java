import java.util.Scanner;

public class Q_5_16_Darpino {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);

		//user input
		System.out.print("Enter an integer: ");
		int number1 = input.nextInt();

		//initalize int
		int number2 = 2; 

		//while loop to calculate all the smallest number2s in increasing order 
		while (number1 / number2 != 1) {

			// Test as a number2 of number
			if (number1 % number2  == 0) {
				System.out.print(number2 + ", ");
				number1 /= number2; 
			}
			//
			else
				number2++; 
		}

		//display results
		System.out.println(number1 + " ");

	}

}
