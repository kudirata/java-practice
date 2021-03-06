package ReviewSession13thJune;
/*
 * Create an interface, Account, with the following methods: 
- deposit: accepts an integer parameter and returns an integer 
- withdraw: accepts an integer parameter and return a boolean 

Define a class, BankAccount, that implements the above interface and has the following members: 
- an instance variable named balance 
- a constructor that accepts an integer that is used to initialize the instance variable
 - an implementation of the deposit method that adds its parameter to the balance variable. 

 The new balance is returned as the value of the method. 
 - an implementation of the withdraw method that checks whether its parameter is less than or equal to the balance and 
 if so, decreases the balance by the value of the parameter and returns true; otherwise, it leaves the balance unchanged and returns false.
 * 
 */
public interface Account {

	int deposit(int amount);
	boolean withdraw(int amount);
}

