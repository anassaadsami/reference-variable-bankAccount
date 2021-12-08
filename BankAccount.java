package AccountWithRerferncVariable;

public class BankAccount {
	
	private double balance = 0 ;
	static int customerNum = 0;
	static String bankName = "SwedBank";
	Customer customer ;   // reference variable of Customer class as a instance variable for 
															// BankAccount class
	public BankAccount() {
		setCustomerNum();    // when we create an object we increment the value of customerNum
//		System.out.println("Welcome to "+ bankName + " " + customer.getName());   // error cause we dont have 
	}                                                                   // customer.getName() yet
	public static int getCustomerNum() {
		return customerNum;
	}
	public static void setCustomerNum() {  // this set without parameter i take it away
		BankAccount.customerNum += 1 ;
	}
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("your balance now is "+ this.balance);
	}
	public void withdrawal(double withdrawalAmount) {
		if(this.balance - withdrawalAmount <= 0)
		System.out.println("only "+ this.balance +" available. you can not withdrawal "+ withdrawalAmount);
		else { 
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal "+ withdrawalAmount + " is completed. Remaining balance are "+ this.balance);
		}
	}
	// method give 0.01 ranta to the married customer and nothing for single
	public double bankRanta() {
		if(customer.isMerreid)
			return balance += balance * 0.01 ;
		else
			return balance ;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayDetails() {
		System.out.println("hi "+ customer.getName() +" your number is "	+getCustomerNum() +" your balance is "+ this.balance );
	}
	

}
