package day08_ConditionalStatement;

import java.util.Scanner;

public class IfElseWithScanner {

	public static void main(String[] args) {
		// passingPercentage = 65;
		//yourScorePercentage = take from scanner
		// check if you passed or failed

		int passingPercentage = 65;
		
		Scanner input = new Scanner (System.in); 
		
		int yourScorePercentage = input.nextInt();
		
		
		System.out.println("What is your score?");
		
		if(yourScorePercentage >= passingPercentage) {
			
			System.out.println("CONGRATULATIONS YOU PASSED!");
		}else {
			System.out.println("YOU FAILED! STUDY MORE! DON'T BE SAD!");
		}
		
		
	}

}
