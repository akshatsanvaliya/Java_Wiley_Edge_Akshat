package Thread;

import java.security.PublicKey;

class BankAccount {
	int Amount = 1000;

	public synchronized void withDrawAmt(int amount) {
		if (this.Amount < amount) {
			System.out.println("Amount is less");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
				System.out.println("Amount Withdraw is Successful");
		}

	}
	public synchronized void depositAmt(int amount) {
		this.Amount += Amount;
		System.out.println("Amount Deposited");
		notify();
	}
	 
	
}

public class InterCommunication {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount();

		Thread t1 = new Thread() {
			public void run() {
				ba.withDrawAmt(1500);
			}
		};

		Thread t2 = new Thread() {
			public void run() {

				ba.depositAmt(1000);

			}
		};
		
		t1.start();
		t2.start();
	}

}
