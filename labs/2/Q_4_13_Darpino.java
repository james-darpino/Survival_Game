import java.util.Scanner;

public class Q_4_13_Darpino {

	public static void main(String[] args) {
		
		//set i = 0
		int i=0;
		
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter a letter : ");
		char ch = sc.next( ).charAt(0);	 
		
		
		
		//Create switch statement to filter vowels
		switch(ch)
		{
		 case  'a' :
		 case 'e'  :
		 case 'i'   :
		 case 'o'  :
		 case 'u'  :
		 case  'A' :
		 case 'E'  :
		 case 'I'   :
		 case 'O'  :
		 case 'U'  :
		i++;
		
		}
		
		//if statement to determine if its a vowel, consonant, or an invalid input
		if(i==1)
		System.out.println(" "+ ch +" is a vowel");
		else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println(" " +ch+" is a consonent");
		
			else
			System.out.println(" " + ch + " is not a valid input");		
		}
	}
	
