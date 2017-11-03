
public class SavingsAccount extends Account{

	double overdraftLimit;

	//default Savings account
	public SavingsAccount() {
		super();

	}

	//savings account with a specific id and balance 
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	//assess if action can be processed 
	public void withdraw(double amount) {
		if (getBalance() < amount) {
			System.out.println("Error: SAVINGS ACCOUNT CANNOT BE OVERDRAWN");
		} else {
			setBalance(getBalance() - amount);
		}
		


	}
}
