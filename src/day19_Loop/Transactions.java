package day19_Loop;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assign value to budget or balance using scanner
		// what is transaction amount?
		// keep doing transaction until you run out of balance
		// 1) it needs to keep track of transactions count
		// 2) if any transaction is about to make transaction negative it needs to give warning
		// 3) after every transaction, program should display remaining balance
		// 4) "Successful transactions count: " + 3
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance");
		double balance = scan.nextDouble();
		
		
		int count = 0;
		
		while(balance > 0) {
			count++;//increase transaction by 1
			System.out.println("What is transaction #"+count+" amount?");
			double transaction = scan.nextDouble();
			//balance = balance - transaction;
			if(transaction > balance) {
				System.out.println("You balance is about to be negative due to this transaction");
			}
			balance -= transaction;
			System.out.println("Current balance: " + balance);
		}
		
		System.out.println("You have insufficient funds for any more transactions, your balance is " + balance);
		System.out.println("Transactions total count:" + count);
	}
}