import java.util.Scanner;

public class Q_7_11_Darpino {

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in); 

		//create array numbers with a length of 10 
		double[] numbers = new double[10]; 

		//prompt the user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();

		//displays the mean and standard deviation
		System.out.println("The mean is " + mean(numbers));
		System.out.println("The standard deviation is " + deviation(numbers));
	}

	// new method standardDeviation to calculate the standard deviation of the 10 numbers  
	public static double deviation(double[] x) {
		// declare variables 
		double standardDeviation = 0;
		double mean = mean(x);

		//for loop to calculate the standard deviation of the 10 numbers 
		for (double e: x) {
			standardDeviation += Math.pow(e - mean, 2);
		}
		return Math.sqrt(standardDeviation / (x.length - 1));
	}

	// new method mean to calculate the mean of the ten numbers  
	public static double mean(double[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}

}
