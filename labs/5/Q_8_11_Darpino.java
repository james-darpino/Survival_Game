import java.util.Scanner;

public class Q_8_11_Darpino {

	public static void main(String[] args) {
		// initialize int m as a 3x3 matrix 
		int[][] m = new int[3][3];

		//create Scanner 
		Scanner input = new Scanner(System.in);

		//prompt user to enter a number between 0 and 511
		System.out.print("Enter a number between 0 and 511: ");
		int n = input.nextInt();

		//initialize binary as a string and set it = to decimalToBinaryModified
		String binary = decimalToBinaryModified(n);

		//determine heads or tails depending on if it's 1's or 0's using binary string
		int binaryNumber = 0; //initialize int binaryNumber
		for (int i = 0; i < m.length; i++) {

			for (int k = 0; k < m[i].length; k++) {
				int coinSide = (binary.charAt(binaryNumber++) == '0') ? 0 : 1;
				m[i][k] = coinSide;
			}
		}
		for (int i = 0; i < m.length; i++) {

			for (int k = 0; k < m[i].length; k++) {
				char ch = (m[i][k] == 0) ? 'H' : 'T';
				System.out.print(ch + " ");
			}
			System.out.println("");
		}

	}
	//method decimalToBinaryModified converts a decimal to binary 
	public static String decimalToBinaryModified(int n) {

		StringBuilder s = new StringBuilder();
		while (n != 0) {
			s.append(n & 1);
			n = n >> 1;
		}
		while (s.length() < 9) {
			s.insert(0, "0");
		}
		return s.toString();
	}

}
