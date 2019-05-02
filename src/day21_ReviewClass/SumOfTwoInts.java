package day21_ReviewClass;

import java.util.Scanner;

public class SumOfTwoInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter 2 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if((num1 + num2) >= 100) {
			int sum = num1 + num2 ;
			System.out.println("Good numbers, sum is: " +sum);
		}

	}

}
