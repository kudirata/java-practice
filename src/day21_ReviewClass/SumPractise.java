package day21_ReviewClass;

import java.util.Scanner;

public class SumPractise {

	public static void main(String[] args) {
		// SUM OF 2 NUMBERS USING DO WHILE LOOP
		
Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		//int sumOfSums=0;
		
		do {
			System.out.println("Enter 2 numbers");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			sum=num1+num2;
			//sumOfSums += sum;
		}while(sum <= 100);
		
		System.out.println("Good Numbers");
		
		

	}

}
