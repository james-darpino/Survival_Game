import java.util.Scanner;

public class Q_7_15_Darpino {

	public static void main(String[] args) {

		//create Scanner 
		Scanner input = new Scanner(System.in); 

		//create an array with a length of 10 
		int[] numbers = new int[10]; 

		//prompt user to enter 10 numbers
		System.out.print("Enter 10 number: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		//initialize int distinctNumbers to find all distinct numbers in the array
		int[] distinctNumbers = eliminateDuplicates(numbers);

		//display the result
		System.out.print("The distinct numbers are:");

		//for loop to find distinct numbers
		for (int k: distinctNumbers) {
			if (k > 0)
				System.out.print(" " + k);
		}
		System.out.println();
	}

	// method eleminateDuplicates returns array and eliminates all duplicate values
	public static int[] eliminateDuplicates(int[] list) {

		//initialize int distinctList  
		int[] distinctList = new int[list.length];
		int i = 0;	
		for (int k: list) {
			if (linearSearch(distinctList, k) == -1) {
				distinctList[i] = k;
				i++;
			}
		}
		return distinctList;
	}

	// method to search the array 
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}

}
