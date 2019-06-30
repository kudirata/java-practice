package ReviewSession13thJune;

public class PayPal implements Account{
	private int balance;
	private String email;
	private String password;
	
	public PayPal(int balance, String email, String password) {
		this.balance = balance;
		this.email=email;
		this.password=password;
	}
	
	
	@Override
	public int deposit(int amount) {
		balance+=amount;
		sendEmail(this.email, "Your balance was increased by: "
				    +amount+"\nCurrent balance is : "+balance);
		return balance;
	}

	@Override
	public boolean withdraw(int amount) {
		if(amount<=balance) {
			balance = balance-amount;
			//if customer, was able to pay successfully
			//he/she will get email notification
			//regarding the transaction
			sendEmail(email, "You paid: " +amount+"\nCurrent balance is : "+balance);
			return true;
		}
		sendEmail(email, "Your balance is low, Current balance is : "+this.balance);
		 //otherwise, it leaves the balance 
			//unchanged and returns false.
		return false;
	}
	
	
	public void sendEmail(String emailReciever, String message) {
		System.out.println("Sending email to: "+emailReciever);
		System.out.println("Email: "+message);
	}


	@Override
	public String toString() {
		return "PayPal [balance=" + balance + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

}
