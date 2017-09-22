import java.util.Scanner;

public class Q_6_3_Darpino {

	public static void main(String[] args) {
		//create Scanner 
		Scanner input = new Scanner(System.in); 

		// user input to get an integer
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();

		//display results ( true = is  : = or  false = is not) 
		System.out.println(integer + (isPalindrome(integer) ? " is " : " is not ") + "a palindrome");

	}

	//create method to reverse the integer ex) 456 would be 654
	public static int reverse(int integer) {

		//initalize strings
		String reverse = "";

		//set number = to integer and convert it from a string to and integer
		String number = integer + ""; 


		//for loop to determine if number is a palindrome
		for (int i = number.length() - 1; i >= 0; i--)
			reverse += number.charAt(i);

		return Integer.parseInt(reverse);



	}
	//create method
	public static boolean isPalindrome(int integer) {

		//return true if number is a palindrome
		return integer == reverse(integer) ? true : false;



	}
}