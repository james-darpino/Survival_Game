import java.util.Scanner;

public class Q_10_5_Darpino {
	public static void main(String[] strings) {
		//create a scanner
		Scanner input = new Scanner(System.in);

		//user input 
		System.out.println("Enter a positive number: ");
		int number = input.nextInt();

		//print all the number's smallest factors in decreasing order
		System.out.print("The smallest factors of " + number + " are: ");

		//create StackOfIntegers
		StackOfIntegers stack = new StackOfIntegers(); 
		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + ", ");

		}


	}


	// method smallestFactors gets the smallest factor of the user inputed number
	private static void smallestFactors(int number, StackOfIntegers stack) {
		// TODO Auto-generated method stub

		int factor = 2; 
		while( number / factor != 1) {


			if (number % factor == 0 ) {
				stack.push(factor);
				number = number / factor ;
			}
			else {
				factor++;
			}
		}


		stack.push(number);

	}





}



