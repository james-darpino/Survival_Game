import java.util.Scanner;

public class Q_8_5_Darpino {

	public static void main(String[] args) {
		//initialize matrix1 and matrix2
		double[][] matrix1 = getmatrix(1);
		double[][] matrix2 = getmatrix(2);

		//initialize matrix3 with the sum of matrix1 and matrix2
		double[][] matrix3 = addMatrix(matrix1, matrix2);

		//display matrix1, matrix2 and matrix3
		print(matrix1, matrix2, matrix3);
	}

	// method getmatrix 
	public static double[][] getmatrix(int n) {
		//create a Scanner
		Scanner input = new Scanner(System.in);

		//prompt user to enter a matrix
		System.out.print("Enter matrix" + n + ": ");

		//make 3 x 3 matrix 
		double[][] m = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				m[i][j] = input.nextDouble();
		}

		return m;
	}

	//method addMatrix adds two matrices and returns the result 
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}

	//displays all the elements in row r 
	public static void print(double[][] m, int r) {	
		for (int j = 0; j < m[r].length; j++) {
			System.out.print(m[r][j] + " ");
		}	
	}

	// method print displays the sum of the matrices 
	public static void print(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The matrices are added as follows");

		for (int i = 0; i < 3; i++) {
			print(m1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(m2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(m3, i);
			System.out.println();
		}
	}

}
