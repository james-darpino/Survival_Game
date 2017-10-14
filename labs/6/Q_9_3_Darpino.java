

public class Q_9_3_Darpino {

	public static void  main(String[] args) {	

		//declare i 
		long i = 0;

		//call date class
		java.util.Date date = new java.util.Date(i);

		//for loop to set the elapsed time
		for (i = 10000; i < 1000000000000L; i = i * 10) {
			
			//set elapsed time
			date.setTime(i);
			
			//display results
			System.out.println("The Date and time are: " + date.toString() + " ");
		}


	}
}


