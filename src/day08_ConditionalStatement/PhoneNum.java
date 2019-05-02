package day08_ConditionalStatement;

import java.util.Scanner;

public class PhoneNum {

	public static void main(String[] args) {
		// Write a program that asks user to input int values: areaCode and localNumber.

//-Using concatenation put together in this format and assign to String phoneNumber  variable:

//-(222)-3334444

//-Write a print statement that displays (use phoneNumber variable ): 
//Calling number (222)-3334444


		int areaCode, localNumber;
		
		 String phoneNumber;
		
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Enter Area Code:");
		 areaCode = scan.nextInt();
		 
		 System.out.println("Enter Local Number:");
		 localNumber = scan.nextInt();
		
		 phoneNumber = "("+areaCode+")-"+localNumber  ;
		 
		 
		System.out.println("Calling number " + phoneNumber);
		
		
		
		
		
		
		
		
	}

}
