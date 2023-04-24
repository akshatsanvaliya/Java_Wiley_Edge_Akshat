package Wiley_pkg_1;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String name;

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.err.println(name);
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
if (amount <= balance) {
	balance -= amount;
	}
else {
	System.err.println("Insufficient Funds!!");
}
}
	public static void main(String[] args) {
BankAccount ba= new BankAccount();
ba.getAccountNumber();
ba.getBalance();
ba.getName();
ba.deposit(123445);
ba.withdraw(22);

	}

}
