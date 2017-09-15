import java.util.Scanner;

public class Q_3_5_Darpino {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Define today and future day
				String today;
				String futureDay = null;
				
		//Display question to user and get input 
		System.out.println("Enter today's number: ");
		int todayNumber = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int numberOfDays = input.nextInt();
	
		// If statement to determine what day user put in
		if (todayNumber == 0) {
			today = ("Sunday"); 
		}
		
		else if (todayNumber == 1) {
			today = ("Monday");
		}
		else if (todayNumber == 2) {
			today = ("Tuesday");
		}
		else if (todayNumber == 3) {
			today = ("Wednesday");
		}		
		else if (todayNumber == 4) {
			today = ("Thursday");
		}
		else if (todayNumber == 5) 
			today = ("Friday");
	
		else 
			today =  ("Saturday");
	// Calculate future day number
		int futureDayNumber = (todayNumber + numberOfDays) % 7;
	
		
	//If statement to determine future day 
		if (futureDayNumber == 0) {
			today = ("Sunday"); 
		}
		
		else if (futureDayNumber == 1) {
			futureDay = ("Monday");
		}
		else if (futureDayNumber == 2) {
			futureDay = ("Tuesday");
		}
		else if (futureDayNumber == 3) {
			futureDay = ("Wednesday");
		}		
		else if (futureDayNumber == 4) {
			futureDay = ("Thursday");
		}
		else if (futureDayNumber == 5) 
			futureDay = ("Friday");
	
		else 
			futureDay = 
			("Saturday");
	
		//Display results
	System.out.println("Today is " + today + " and the future day is " + futureDay + " " );
	
}
}
