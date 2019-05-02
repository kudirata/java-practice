package day15_String_Manipulation;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		System.out.println("word1:");
		String word1 = scan.next();
		
		System.out.println("word2:");
		String word2 = scan.next();
		
		 
	    //if (word1 .equalsIgnoreCase(word2)) {
	     // System.out.println("word1 equals word2");
	            
	   // }else  if (!word1 .equalsIgnoreCase(word2)) {
	    //  System.out.println("word1 does not equal word2");
	   
	   // }
	    
		if (word1.equalsIgnoreCase(word2)){
			System.out.println("word1 equals word2");
		}else{
			System.out.println("word1 does not equal word2");
		}
		

	}

}
