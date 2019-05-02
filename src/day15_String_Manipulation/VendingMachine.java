package day15_String_Manipulation;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int itemPrice;
		 int quarters, dimes, nickels;
		    
		    Scanner scan = new Scanner (System.in);
		    
		    System.out.println("Enter itemPrice:");
		    itemPrice = scan.nextInt();
		    
		    System.out.println("Enter money value:");
		    int moneyValue = scan.nextInt();
		    
		 int change = moneyValue - itemPrice;
		 
		 
		 quarters = change / 25;
	        change = change %25;

	        dimes = change /10;
	        change = change %10;

	        nickels = change / 5;
	        change = change % 5;
	        
	        System.out.println("Your change is:"+quarters + " quarters, "+ dimes + " dimes, and "+ nickels + " nickels");
	        String report = quarters + " quarters, "+ dimes + " dimes, and "+ nickels + " nickels";
	        
		    
	        if (itemPrice < 25 && itemPrice > 100) {
			       System.out.println("Invalid price!");
			       
			      
			    }else if (itemPrice % 5 != 0) {
			    	System.out.println("Your change is:"+quarters + " quarters, "+ dimes + " dimes, and "+ nickels + " nickels");
			      
			    }
			
		
   
		

	}

}
