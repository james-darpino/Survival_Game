import java.util.ArrayList;
import java.util.Scanner;

public class Q_11_11_Darpino {

	public static void main(String[] args) {
		//create array list 
		ArrayList<Integer> list = new ArrayList<Integer>();

		//Scanner
		Scanner input = new Scanner(System.in);

		//user input
		System.out.println("Enter five numbers: ");
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());
		list.add(input.nextInt());




		sort(list);

		//test
		System.out.println("" + list.toString() + "");
	}
	//sorts array list 
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);

	}



}
