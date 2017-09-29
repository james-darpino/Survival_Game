import java.util.Scanner;

public class Q_7_9_Darpino {

	public static void main(String[] args) {
		//create Scanner 
		Scanner input = new Scanner(System.in); 
		// create array numbers with a length of 10 
		double[] numbers = new double[10]; 

		//prompt  user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}

		//display the minimum value
		System.out.println("The minimum number is: " + min(numbers));
	}

	// new method min returns the smallest number 
	public static double min(double[] array) {
		double min = array[0];	
		for (double i: array) {
			if (i < min)
				min = i;
		}
		return min;
	}

}
