package Encapsulation;

public class Bank {
	
	public int accountNo = 123456;
	private int pinNo = 1234;
	public int balanceAmount = 10000;
	
	public void withdrawAmount(int accNo, int pin, int amount) {
		if(accNo == accountNo && pin == pinNo ) {
			balanceAmount = balanceAmount -amount;
			System.out.println("Amount Withdrawn successfully");
		}
		else {
			System.out.println("Invalid Credentails");
		}
	}
	
	public void updatePin(int accNo, int oldPin, int newPin) {
		if(accNo == accountNo && oldPin == pinNo ) {
			pinNo = newPin;
			System.out.println("Updated Pin successfully");
		}
		else {
			System.out.println("Invalid credentials");
		}
		
	}

	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

//	public int getAccountNo() {
//		return accountNo;
//	}
	
	public void fetchAccountNo() {
		System.out.println("My Account No is "+accountNo);
	}

	public void setPinNo(int accNo, int oldPin, int newPin) {
		if(accNo == accountNo && oldPin == pinNo ) {
			pinNo = newPin;
			System.out.println("Updated Pin successfully");
		}
		else {
			System.out.println("Invalid credentials");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
