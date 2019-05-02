package day20_Loop;

import java.util.Scanner;

public class ZombieAttack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day = 0;
	    
	    while(inhabitants > 0) {
	    	System.out.println("Day "+day + " ["+ inhabitants + "]");
	    	day++;                                   // DAY IS INCREASING HERE
	    	inhabitants = inhabitants / 2;            // INHABITANTS DECREASE BY HALF
	    }
	     
	    	 System.out.println("---- EXTINCT ----"); 
	

	}

}
