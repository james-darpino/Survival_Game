import java.util.Scanner;

public class Q_4_21_Darpino {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter a SSN: ");
		String ssn = input.nextLine();
		
		// Check whether the input is valid
				boolean isValid = 
					(ssn.length() == 11) && 
					(Character.isDigit(ssn.charAt(0))) &&
					(Character.isDigit(ssn.charAt(1))) &&
					(Character.isDigit(ssn.charAt(2))) &&
					(ssn.charAt(3) == '-') &&
					(Character.isDigit(ssn.charAt(4))) &&
					(Character.isDigit(ssn.charAt(5))) &&
					(Character.isDigit(ssn.charAt(7))) &&
					(ssn.charAt(6) == '-') &&
					(Character.isDigit(ssn.charAt(8))) &&
					(Character.isDigit(ssn.charAt(9))) &&
					(Character.isDigit(ssn.charAt(10)));

				// Display result
				System.out.println(ssn + " is " + ((isValid) ? "a valid " : "an invalid ")
					+ "social security number");
	}

}
