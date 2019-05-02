package ReplitAssignments;

import java.util.*;

public class Party83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		    Scanner input = new Scanner(System.in);

		    
		    // your code 
		    // ------------------------------------------
		    
		    int guestCounter=1;
				System.out.println("Please enter guest name:");
				String name1=input.next();
				String name2 = null;
				System.out.println("Do you want to enter new guest name:");
				String YesNo = input.next();
				 String guestList = null;
				 guestList=name1;
				        do {
					System.out.println("Please enter guest name:");
					 name2=input.next();
					 guestList=guestList+", "+name2;
					 
					 
					 System.out.println("Do you want to enter new guest name:");
				      YesNo=input.next();
				       
				       }while(guestCounter>=0 && YesNo.equals("yes") );
				       
				
				
				System.out.println("Guest's list: "+guestList);	 
		    
		    //System.out.println("Please enter guest name: ");
		    String guestName = input.next();
		    
		    //System.out.println("Do you want to enter new guest name:");
		    
		    
		    
		    
		  }
		
		
		
	}


