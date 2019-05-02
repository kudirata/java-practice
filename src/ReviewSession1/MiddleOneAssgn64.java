package ReviewSession1;

import java.util.Scanner;

public class MiddleOneAssgn64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		    if(!(word.length() % 2 == 0)) {
		    	if(word.length() >= 3) {
			    	System.out.println(word.charAt(word.length() / 2));
			    	
			    	
			    }else  {
			    	System.out.println(word + word + word);
			    } 
		    	
		    	
		    	
		    }if(word.length() % 2 == 0) {
		    	if(word.length() >= 4) {
		    		System.out.print(word.charAt(word.length() / 2 -1 ));
		    		System.out.print(word.charAt(word.length() / 2));
		    	}
		    }
		    
		    
		    System.out.println();
		    if (word.length() == 2) {
					word = word+word;
		    System.out.println(word);
		    }
		    
		  }
		
		
	}


