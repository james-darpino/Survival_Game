
public class CheckingAccount extends Account {

	double overdraftLimit;

	//default checking account
	public CheckingAccount() {
		super();
		overdraftLimit = -250;
	}

	// checking account with specific value
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	//getter
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	//assess if overdraft is occurring 
	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("ERROR: You don't have enough movey in your checking account");
		}
		


	}

}
