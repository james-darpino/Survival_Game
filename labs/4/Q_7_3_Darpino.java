import java.util.Scanner;

public class Q_7_3_Darpino {

	public static void main(String[] args) {
		//declare array countsOccurrences with a length of 100
		int[] countsOccurrences = new int[100]; 


		//prompt user to enter integers between 1 and 100
		System.out.print("Enter the integers between 1 and 100: ");

		// Count occurrence of numbers
		count(countsOccurrences);

		// for loop to get how many occurrences there are 
		for (int i = 0; i < countsOccurrences.length; i++) {
			if (countsOccurrences[i] > 0)

				//display results
				System.out.println((i + 1) + " occurs " + countsOccurrences[i] +
						" time" + (countsOccurrences[i] > 1 ? "s" : ""));
		}
	}

	//new method count finds out how many times an integer is being displayed 
	public static void count(int[] countsOccurrences){
		Scanner input = new Scanner(System.in);

		//declare variable num 
		int num;

		//do while loop to calculate the repeating occurrences 
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	
				countsOccurrences[num - 1]++;
		} while (num != 0);
	}

}
