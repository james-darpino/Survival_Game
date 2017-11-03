
public class Q_11_3_Darpino {

	public static void main(String[] args) {
		// Create Account, SavingsAccount and Checking Account objects
		Account account = new Account(1122, 20000);
		CheckingAccount checkingAccount = new CheckingAccount (432, 5000, 50);
		SavingsAccount savingsAccount = new SavingsAccount (234, 5000);

		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);
		checkingAccount.setAnnualInterestRate(4.5);
		savingsAccount.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);
		checkingAccount.withdraw(2500);
		savingsAccount.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		checkingAccount.deposit(3000);
		savingsAccount.deposit(3000);

		// Invoke toString methods
		System.out.println("Information for Account:" + account.toString());
		System.out.println("");
		System.out.println("Information for Checking Account: " + checkingAccount.toString());
		System.out.println("");
		System.out.println("Information for Savings Account: " + savingsAccount.toString());
	}

}
