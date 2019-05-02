package day23_LoopControl;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program to verify if a number is prime
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		int count = 0;
		
		for (int i = 2; i <= 100; i++) {
			if(num % i == 0) 
				count++;
			
		}if(count>1) {
			System.out.println("not prime");
			
			
		}else System.out.println(num +" is prime");
			
		
		


	}

}


