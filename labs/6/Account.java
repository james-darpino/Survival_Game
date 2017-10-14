import java.util.Date;

public class Account {

	//declare data fields
	private int id;


	private double balance;


	private double annualInterestRate;


	private Date dateCreated;

	//no-arg constructor that creates a default account 
	public Account() {

		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	//constructor that creates account with the specified id and initial balance
	public Account(int updatedId, double updatedBalance) {

		id = updatedId;
		balance = updatedBalance;
		dateCreated = new Date();
	}

	//mutator for id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//mutator for balance
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	//mutator for annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	//method getMonthlyInterestRate that returns the monthly  interest rate
	public double getMonthlyInterestRate() {

		double monthlyInterestRate = annualInterestRate / 12;


		return monthlyInterestRate;
	}

	//method getMonthlyInterest that returns monthlyInterest
	public double getMonthlyInterest() {

		double monthlyInterest = balance * (getMonthlyInterestRate() / 100);



		return monthlyInterest;




	}

	//method withdraw
	public double withdraw(double amount) {
		balance = balance - amount;

		return balance;


	}

	//method deposit
	public double deposit (double amount) {
		balance = balance + amount;

		return balance;
	}
}


