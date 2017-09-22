import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_5_1_Darpino {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);

		// initalize ints 
		int positive = 0;
		int negative = 0;
		int addNumbers = 0;

		//initalize the sum of numbers
		double sum = 0;

		//user input 
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		// if statement to end user input of 0 is chosen
		if (number == 0) {
			System.out.println("No numbers are entered except 0");
			System.exit(1);
		} 
		
		//while loop to sort positive numbers from negatives, and find how many of each 
		while (number != 0) {
			if (number > 0)
				positive++;
			else
				negative++;
			sum += number;
			addNumbers++;
			number = input.nextInt();
		}

		// calculate the average 
		double average = sum / addNumbers;

		//display the results
		System.out.println("The number of positives is " + positive + "");
		System.out.println("The number of negatives is " + negative + "");
		System.out.println("The total is " + sum + "");
		System.out.println("The average is " + average + "");
	}

}
