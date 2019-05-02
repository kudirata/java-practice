package ReplitAssignments;

import java.util.*;

public class MergeThem66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		    char first = word1.charAt(0);
		    char second = word2.charAt(0);
		    char third = word1.charAt(1);
		    char four = word2.charAt(1);
		    char five = word1.charAt(2);
		    char six = word2.charAt(2);
		   
		  
		    
		    if(word1.length()== 3 && word2.length()== 3){
		      System.out.println(first+"" +second+"" +third+"" +four+"" +five+"" +six);
		      
		    }else{
		    
		      System.out.println("cannot merge");
		      
		    }
		    
		    
		  }
		
		
	}


