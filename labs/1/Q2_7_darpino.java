//Question 2.7
import java.util.Scanner;

public class Q2_7_darpino {

	public static void main(String[] args) {
		// Create Scanner 
		Scanner input = new Scanner(System.in);

		// User input
		System.out.print("Enter the number of minutes: ");
		int minute = input.nextInt();

		// Conversions
		int hour = (minute / 60); // Convert minutes to hours
		int day = (hour / 24); // Convert hours to days 
		int year = (day / 365); // Convert days to years
		int remainingTime = (day % year); // Find remaining days 

		// Display results
		System.out.println( + minute + " minutes is approximately " + year + " years and " + remainingTime + " days " );

	}

}
