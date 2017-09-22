import java.util.Scanner;

public class Q_5_13_Darpino {

	public static void main(String[] args) {


		//create Scanner
		Scanner input = new Scanner(System.in);


		//initalize n 
		int n = 0;


		//while loop to find largest possible n value, 
		//such that n^3 < 12,000
		while (Math.pow(n, 3) < 12000) {
			n++;
		}


		//display the results
		System.out.println( "the largest integer n, such that n^3 is less than 12,000 is: " + (n - 1) + "");




	}

}
