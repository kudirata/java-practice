package day09_stringEquals_Conditionals;

import java.util.Scanner;

public class Canada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String capital;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What is the capital of Canada?");
		capital = scan.nextLine();
		
		
		if (capital.equalsIgnoreCase("Ottawa")) {  //IgnoreCase makes it to be case insensitive
			System.out.println("Your answer is correct!");
			
		}else {
			
			System.out.println("Your answer is incorrect! "+capital+" is not capital of Canada");
		}

	}

}
