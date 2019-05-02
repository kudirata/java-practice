package ReplitAssignments;

import java.util.Scanner;

public class ReverseIt67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  
		    Scanner scan = new Scanner(System.in);
		    System.out.println("input word:");
		    String word = scan.next();
		    
		    //WRITE YOUR CODE HERE
		    
		    
		    if(word.length() < 5){
		        System.out.println("Too short!");
		      }
		      else if(word.length() > 5){
		        System.out.println("Too long!");
		        
		      }else{
		      
		        for(int i = word.length()-1; i >= 0; i--){
		         System.out.print(word.charAt(i)); 
		         
		        }
		      }
		    
		    }
		  }
	


