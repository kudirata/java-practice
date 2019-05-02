package day15_String_Manipulation;

import java.util.Scanner;

public class FindTheLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
	    System.out.println("Please enter the text:");
	    String text = scan.next();
			
			
			int length = text.length();
			
			System.out.println("Length is: "+length);

	}

}
