package Wiley_pkg_1;

interface Bank{
	void account();
}

interface Bank1{
	void account();
}
interface ATM extends Bank, Bank1{//we can extends as many interface as we can.
	void insertCard();
	void selectOption();
	void enterPassword();
}

interface AA{
	void m1();

}

abstract class NewATM implements ATM, AA{
	public void account() {
		
	}
	
	public void m1() {
		
	}







}

public class InterfBank extends NewATM {
	public void insertCard() {

		System.out.println("Inside insertCard");
			
		}

		@Override
		public void selectOption() {
			System.out.println("Inside selectCard");
			// TODO Auto-generated method stub
			
		}

		@Override
		public void enterPassword() {
			System.out.println("Inside enterPassword");
			// TODO Auto-generated method stub
			
		}

	public static void main(String[] args) {
		
	}
}	