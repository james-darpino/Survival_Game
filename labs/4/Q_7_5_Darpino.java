import java.util.Scanner;

public class Q_7_5_Darpino {

	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);
		
		//declare array distinctNumbers with a length of 10 
		int[] distinctNumbers = new int[10]; 
		
		
		//declare variables count and num
		int num; 				
		int count = 0;			

		//prompt user to enter ten numbers
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			//calculate whether num is a distinct number or 
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	
			}
		}

		// Displays how many distinct numbers there are 
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		
		// puts a space to separate each distinct number
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	// new method isDistinct returns true if number is not in distinctNumbers, otherwise it's false 
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}

}
