import java.util.Scanner;

public class Q_5_5_Darpino {

	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);

		//create a constant double to show how many pounds are in 1 kilogram 
		final double poundsPerKilogram = 2.2;


		// display the first line of the table 
		System.out.println(
				"Kilograms    Pounds     |     Pounds      Kilograms");

		//for loop to convert kilograms to pounds and pounds to kilograms
		for (int kilograms = 1, pounds = 20; kilograms <= 199 && pounds <= 515; kilograms += 2, pounds += 5) {

			//display the rest of the table 
			System.out.printf("%-12d %7.1f", kilograms, (kilograms * poundsPerKilogram));
			System.out.print("     |     ");
			System.out.printf("%-9d %12.2f\n", pounds, (pounds / poundsPerKilogram));


		}


	}
}