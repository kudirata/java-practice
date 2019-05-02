package day23_LoopControl;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write program that will calculate a sum of 6 numbers
		// if number is less than or equal zero ignore this number
		
		int sum = 0;
		int num = 0;
		
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Enter a number:");
			
			num = scan.nextInt();
			
			if (num <= 0) {
				
				continue;	
			}
			sum += num;
		}
		System.out.println("Total sum:"+ sum);
		
		

	}

}
