package entities;

public class MetodBank {

	private int accountNumber;
	private String accountHolder;
	private double balance;

	public MetodBank(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		deposit(initialDeposit);
	}

	public MetodBank(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		balance += deposit;
	}

	public void withdraw(double withdraw) {
		balance -= (withdraw + 5.0);
	}

	public String toString() {
		return String.format("Account %d, Holder: %s, Balance: $ %.2f%n", accountNumber,
				accountHolder, balance);
	}

}
