
public class Q_6_13_Darpino {

	public static void main(String[] args) {

		//declare variables to represent the starting and ending point of the graph
		double firstNumber  =  1.0;	
		double lastNumber = 20.0;

		//display graph
		System.out.println("\ni         m(i)     ");
		System.out.println("-------------------");

		// for display the series and the sum 
		for (double i = firstNumber; i <= lastNumber; i++) {
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sumSeries(i));
		}
	}


	// new method sum, this calculates the sum of the series
	public static double sumSeries(double n) {
		double sum = 0;	
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1);
		}
		return sum;

	}

}
