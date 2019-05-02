package day07_ScannerObjects;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, sum;
		
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Enter 3 numbers:");
		
		
		// Using scanner object let user input 3 numbers
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		sum = num1 + num2 + num3;
		
		System.out.println("Sum of numbers: "+sum);
		
		
		
		
		
	}

}
