import java.util.Scanner;

public class Q_3_2_Darpino {

			public static void main(String[] args) {
				
				// Create 3 numbers randomly generated from 1-9
				int number1 = (int)(Math.random() * 10);
				int number2 = (int)(Math.random() * 10);
				int number3 = (int)(Math.random() * 10);

				// Create a Scanner
				Scanner input = new Scanner(System.in);
				
				// Displays info for user 
				System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
				int answer = input.nextInt();
				
				// Create while loop to determine if the answer is true or false, if the answer is true, the user gets to retry 
				while (number1 + number2 + number3 != answer) {
					System.out.print("Wrong answer. Try again. "
							+ "What is " + number1 + " + " + number2 + " + " + number3 + "? ");
					answer = input.nextInt();			
				}
				
				System.out.println("You got it!");
			}


	}


