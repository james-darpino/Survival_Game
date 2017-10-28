
public class MyInteger {
	// declare data fields
	private int value;



	// constructor MyInteger for specified int value 
	public MyInteger(int value) {
		this.value = value;

	}


	//getter to return int value
	public int getValue() {
		return value;
	}

	//method isEven to return true if the integer is even
	public  boolean isEven() {
		if (isEven(value) == true) {
			return true;
		}
		else {
			return false;
		}

	}

	//method isOdd to return true if the integer is odd
	public boolean isOdd() {
		if (isOdd(value) == true) {
			return true;
		}
		else {
			return false;
		}
	}

	//method isPrime to return true if the integer is prime
	public boolean isPrime() {
		if (isPrime(value) == true) {
			return true;
		}

		else {
			return false;
		}
	}

	//method isEven(int value) to return true if the integer is even
	public static boolean isEven(int value) {
		if ((value) % 2 == 0) {
			return true;
		}

		else {
			return false;
		}

	}

	//method isOdd(int value) to return true if the integer is odd
	public static boolean isOdd(int value) {
		if ((value) % 2 != 0) {

			return true;
		}
		else {
			return false;
		}
	}

	//method isPrime(int value) to return true if the integer is prime
	public static boolean isPrime(int value) {
		for(int i = 2; i <=  (value / 2); i++){    
			if(value % i == 0) 
				return false;
		}

		return true;
	}

	//method isEven(MyInteger value) to return true if the integer is even
	public static boolean isEven(MyInteger myInteger) {
		if (myInteger.isEven() == true) {
			return true;
		}

		else {
			return false;
		}

	}

	//method isOdd(MyInteger value) to return true if the integer is odd
	public static boolean isOdd(MyInteger myInteger) {
		if (myInteger.isOdd() == true) {
			return true;
		}

		else {
			return false;
		}
	}

	//method isPrime(MyInteger value) to return true if the integer is prime
	public static boolean isPrime(MyInteger myInteger) {
		if (myInteger.isPrime() == true) {
			return true;
		}

		else {
			return false;
		}

	}

	// method equals(int) returns true if a value in this object is equal to a specific value 


	public boolean equals(int value) {
		if(this.value == value) {
			return true;
		}
		else {
			return false;
		}
	}

	// method equals(MyInteger value) returns true if a value in this object is equal to a specific value 
	public boolean equals(MyInteger myInteger) {
		if(myInteger.value == this.value) {
			return true;
		}
		else {
			return false;
		}
	}

	// method parseInt(char[]) converts an array of numeric characters to int values 
	public static int[] parseInt(char[] myChar) {
		int[] myInt = new int[myChar.length];
		for(int x = 0; x < myChar.length; x++)
		{
			myInt[x] = (int)myChar[x];
		}
		return myInt;


	}
	// method parseInt(String) converts an array of numeric characters to int values 
	public static int parseInt(String myString) {
		return Integer.parseInt(myString);

	}

}


