import java.util.Scanner;

public class Q_9_13_Darpino {

	public static void main(String[] args) {
		// Create a Scanner object
				Scanner input = new Scanner(System.in);
				
				
				
				//user input 
				System.out.print("Enter the number of rows and columns in the array: ");
				int rows = input.nextInt();
				int columns = input.nextInt();
				
				// Create a matrix
				double[][] array = new double[rows][columns]; 
				System.out.println("Enter the array: ");
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						array[i][j] = input.nextDouble();
					}
				}

				//call max 
				Location max = locateLargest(array);

				// Display the location of the largest element in the array
				System.out.println("The location of the largest element is " +
					max.maxValue + " at (" + max.row + ", " + max.column + ")");
			}

			//locateLargest returns an instance of Location 
			public static Location locateLargest(double[][] a) {
				return new Location(a);
			}
	}


