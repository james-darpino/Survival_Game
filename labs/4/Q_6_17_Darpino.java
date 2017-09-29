import java.util.Scanner;

public class Q_6_17_Darpino {

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in); 

		// user input
		System.out.print("Enter n: ");
		int n = input.nextInt();

		//displays an n by n matrix
		printMatrix(n);


	}

	// method printMatrix calculates an n by n matrix
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {

				// randomly generate a number between 0 and 1 
				System.out.print((int)(Math.random() * 2));
			}
			
			// displays new line 
			System.out.println();
		}
	}

}
