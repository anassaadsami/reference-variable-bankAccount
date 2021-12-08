package AccountWithRerferncVariable;

public class Main {

	public static void main(String[] args) {
//		Customer customer1 = new Customer("anas", 40 , "4168993",true);
//		Customer customer2 = new Customer("ali", 35 , "4168989",true);
//		Customer customer3 = new Customer("fahad", 20 , "4168989",false);
		
		BankAccount account1 = new BankAccount();
		account1.customer = new Customer("anas", 40 , "4168993",true);
		account1.displayDetails();
		System.out.println(account1.customer.getAge());
		account1.deposit(100);
		account1.displayDetails();
		account1.withdrawal(50);
		System.out.println(account1.bankRanta());
		
		
		
//		BankAccount account2 = new BankAccount();
//		account2.customer = new Customer("ali", 35 , "4168989",true);
//		account2.displayDetails();
//		
//		BankAccount account3 = new BankAccount();
//		account3.customer = new Customer("fahad", 20 , "4168989",false);
//		account3.displayDetails();
//		account3.deposit(100);
//		System.out.println(account3.bankRanta());
//		System.out.println(account3.getBalance());
//		System.out.println(Account.getBankName());
		
	}

}
