package day15_String_Manipulation;
import java.util.Scanner;
public class FindAUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE 
		    
		    
		    System.out.println("Enter full name:");
		    String fullName = scan.next();
		    
		    if (fullName.equalsIgnoreCase("Max Payne")| fullName.equalsIgnoreCase("Alan Wake")) {
		      System.out.println("User found!");
		    }else {
		      System.out.println("User not found!");
		    }
		    

	}

}
