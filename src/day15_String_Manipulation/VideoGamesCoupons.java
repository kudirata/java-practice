package day15_String_Manipulation;

import java.util.Scanner;

public class VideoGamesCoupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfWins, numberOfCoupons = 0;
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println ("Enter number of coupons:");
	    numberOfCoupons = scan.nextInt();
	    
	    if (numberOfCoupons >= 10) {
	        int numberOfCandies = numberOfCoupons / 10 ;
	        System.out.println ("Number of Candies:"+numberOfCandies);
	        
	      }else if (numberOfCoupons >= 3) {
	       int numberOfGumballs = numberOfCoupons % 10 ;
	        System.out.println ("Number of Gumballs:"+numberOfGumballs);
	      }else {
	    	  System.out.println ("Not enough coupons");
	      }
	      
	    
	    
	   

		
		

	}

}
