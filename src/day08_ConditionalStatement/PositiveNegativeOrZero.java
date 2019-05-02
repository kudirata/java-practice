package day08_ConditionalStatement;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		
		
		
		    Scanner s = new Scanner(System.in);
		    
		    int num = s.nextInt();

		    if (num > 0) {
		      System.out.println("positive");
		      
		    }else {
		      
		      if (num < 0){
		        System.out.println("negative");
		        
		      }else {
		    	  
		    	  if(num == 0) {
		    	System.out.println("zero");	  
		    		
		    		  
		    	  }
		      }
		      
		      
		    }
		    
		   
		  

		    
		  }
		

	}


