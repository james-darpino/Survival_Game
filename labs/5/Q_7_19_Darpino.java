import java.util.Scanner;

public class Q_7_19_Darpino {

	public static void main(String[] args) {

		//create Scanner 
		Scanner input = new Scanner(System.in);

		//prompt user to enter a list
		System.out.println(" Enter the size of the list: ");
		System.out.println("Enter the contents of the list: ");

		//initialize int list 
		int[] list = new int[input.nextInt()];

		// for loop fins length of the list 
		for (int i = 0; i < list.length; i++)
			list[i] = input.nextInt();

		//displays results
		System.out.println(
				"The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
	}

	// method isSorted returns true if the list is sorted in nondecreasing order, otherwise false
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1])
				return false;
		}
		return true;

	}

}
