import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
public class Q_12_3_Darpino {

	public static void main(String[] args) {
		int[] array = getRandomArray();

		//scanner 
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the index of the array: ");



		try {
			int index = array[input.nextInt()];

			System.out.println("The corresponding element value is:  "  + index + " ");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}
//random num from 0 to 100
	private static int[] getRandomArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 101);
		}
		return array;

	}

}
