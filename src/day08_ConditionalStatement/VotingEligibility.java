package day08_ConditionalStatement;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// program to tell if you're eligible to vote.
		//votingAge = 18
		//yourAge = take from scanner
		// if you're eligible to vote, write, "You are eligible to vote"
		//You have been eligible for 3 years 
		//else
		// "You are not eligible to vote
		// You still have 3 more years
		

		
		Scanner keyboard = new Scanner (System.in); 
		
		int votingAge = 18;
		
		System.out.println("How old are you?");
		
		int yourAge = keyboard.nextInt();
		
		int years = yourAge - votingAge;
		
		if(yourAge >= votingAge) {
			
			System.out.println("You are eligible to vote");
			System.out.println("You have been eligible for "+years+" years");
		}else {
			
			int moreYears = votingAge - yourAge;
			System.out.println("You are not eligible to vote");
			System.out.println("You still have "+ moreYears +" more years to go");

	}

 }

}	
	
	
	
	
	
	
	
	