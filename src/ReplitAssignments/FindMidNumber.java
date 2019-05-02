package ReplitAssignments;

import java.util.Scanner;

public class FindMidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, median=0;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter first number:");
	    num1 = scan.nextInt();
	    
	    System.out.println("Enter second number:");
	    num2 = scan.nextInt();
	    
	    System.out.println("Enter third number:");
	    num3 = scan.nextInt();
	    
	    if(num3 >= num1 && num3 <= num2) {
	    	
	    	System.out.println("Medium value is: "+ num3);
	    	
	    }else  {
	    	
	    	System.out.println("Medium value is: "+ num2);
	    }
	    
	
		

	}

}
