import java.util.GregorianCalendar;

public class Q_9_7_Darpino {

	public static void main(String[] args) {
		//call account class with id of 1122 and balance of 20k
		Account account = new Account(1122, 20000);


		// Set annual interest rate 4.5%
		account.setAnnualInterestRate(4.5);


		//withdraw 2.5k
		account.withdraw(2500);

		//deposit 3k
		account.deposit(3000);
		//call balance
		double balance = account.getBalance();
		double monthlyInterest = account.getMonthlyInterest();


		//call the gregorian calendar class
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();


		//call get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
		// get(GregorianCalendar.DAY_OF_MONTH)
		long currentYear = calendar.get(GregorianCalendar.YEAR);
		long currentMonth = calendar.get(GregorianCalendar.MONTH);
		long currentDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);

		//display results
		System.out.println("The balance is: $" + balance + "");
		System.out.println("The monthly interest is: $" + monthlyInterest + "");
		System.out.println("The date this was created was: " + currentMonth + "/" + currentDay + "/" + currentYear + "");


	}
}
