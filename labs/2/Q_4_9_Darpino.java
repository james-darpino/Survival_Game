import java.util.Scanner;

public class Q_4_9_Darpino {

	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//user input
		System.out.print("Enter a character: ");
		
		//Converting a character to Unicode
		String temp = input.nextLine();
		char ch = temp.charAt(0);
		int a = (int) ch; 
		System.out.println(a); 
		
	}
	}


