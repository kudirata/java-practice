package QUIZZES;

import java.util.ArrayList;
import java.util.Scanner;

public class test5 {

	
	//public static void main(String[] args) {

		

		//class Main {
		  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    System.out.print("#1: ");
		    int num1 = s.nextInt();
		    System.out.print("#2: ");
		    int num2 = s.nextInt();
		    //start on line 11
		    
		    if(num2 > num1) {
		    	for(int j = num1; j <= num2; j++) {
					if(j % 2 != 0) {                         // DECLARES ODD NUMBERS
						System.out.print(j +" ");
			}
		      
		    }
		    
		  }
		  }
}

		

