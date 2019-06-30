package ReviewSession13thJune;

//Define a class, BankAccount, that implements the above interface
public class BankAccount implements Account{
//- an instance variable named balance 
	private int balance;
	
	// a constructor that accepts an integer 
	public BankAccount(int balance) {
		//that is used to initialize the instance variable
		this.balance=balance;
	}
	
	//an implementation of the deposit method that 
	//adds its parameter to the balance variable.
	@Override
	public int deposit(int amount) {
		balance+=amount;
		// The new balance is returned as the value of the method.
		return balance;
	}
	//- an implementation of the withdraw method that checks 
	//whether its parameter is less than or equal to the balance and 
	 //if so, decreases the balance by the value of the parameter 
	//and returns true; otherwise, it leaves the balance 
	//unchanged and returns false.
	@Override
	public boolean withdraw(int amount) {
		if(amount<=balance) {
			balance = balance-amount;
			return true;
		}
		 //otherwise, it leaves the balance 
			//unchanged and returns false.
		return false;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}
