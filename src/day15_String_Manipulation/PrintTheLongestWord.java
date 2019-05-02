package day15_String_Manipulation;

import java.util.Scanner;

public class PrintTheLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //WIRTE YOUR CODE HERE
	    
	    if (word1.length() > word2.length()) {
	    	System.out.println(word1);
	        
	    }else if(word2.length() > word1.length()) {
	    	System.out.println(word2);
	    }
		
		
		

	}

}
