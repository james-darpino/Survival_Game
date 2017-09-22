import java.util.Scanner;

public class Q_6_1_Darpino {

	public static void main(String[] args) {

		//create Scanner
		Scanner input = new Scanner(System.in);

		//declare constants 
		final int numberOfPentagonals = 100; 
		final int numbersPerLine = 10; 


		//display 100 pentagonal numbers
		for (int i = 1; i <= numberOfPentagonals; i++) {

			//if statement to go to next line if i is ends in a 0
			if (i % numbersPerLine == 0) 
				System.out.printf("% 7d \n", getPentagonalNumber(i));

			//print the pentagonal number
			else
				System.out.printf("% 7d", getPentagonalNumber(i));
		}
	}

	//calculate value of the pentagonal number 
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;

	}

}
