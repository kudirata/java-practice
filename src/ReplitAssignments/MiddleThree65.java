package ReplitAssignments;
import java.util.*;
public class MiddleThree65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //YOUR CODE HERE
		
		 int x = word.length();
		    if(x%2 != 0 && x >= 5){
		      if(x == 5){
		        System.out.println(word.substring(1,4));
		      }
		      else if(x > 5){
		       int start = x/2 - 1;
		       int end = x/2 + 2;
		        System.out.println(word.substring(start,end));
		        
		      }
		      
		    } 
		    else{
		        System.out.println("invalid");
		      }
		 }
		
		
	}


