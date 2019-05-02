package day12_logical_Switch_Ternary;

import java.util.Scanner;

public class SecondsConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		 
		int seconds ;
		int result = 0;
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter seconds:");
		
		seconds = s.nextInt();
		
		int hours = seconds / 3600;
		
		int remainingMinutes = seconds % 60 ;
		
		int remainingSeconds = remainingMinutes / 60;
        
        
        
        System.out.print(hours+" hours, "+remainingMinutes+" minutes," + " and " + remainingSeconds + " seconds");
		
		
		//result = 
		

	}

}
