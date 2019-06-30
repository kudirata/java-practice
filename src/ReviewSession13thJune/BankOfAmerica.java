package ReviewSession13thJune;

import java.util.ArrayList;
import java.util.List;

public class BankOfAmerica {
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(5000);
		//2. Reference type is an interface
		Account account2 = new BankAccount(10000);
		System.out.println(account1.deposit(200));
		System.out.println(account1.withdraw(4000));
		System.out.println("*************");
		PayPal paypalaccount1 = new PayPal(0, "sdet@email.com", "12345");
		System.out.println(paypalaccount1.deposit(400));
		Account paypalaccount2 = new PayPal(100, "user2@email.com", "qwerty");
		paypalaccount2.withdraw(50);
		List<Account> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(paypalaccount1);
		accounts.add(paypalaccount2);
		System.out.println("*****************");
		for(Account a: accounts) {
			//print info about every account
			System.out.println(a);
		}
		
	}
}
