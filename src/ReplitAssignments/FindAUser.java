package ReplitAssignments;

import java.util.Scanner;

public class FindAUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
	    String fullName = scan.nextLine();
	    
	    if (fullName.equalsIgnoreCase("Max Payne")|| fullName.equalsIgnoreCase("Alan Wake")) {
	      System.out.println("User found!");
	    }else {
	      System.out.println("User not found!");
	    }

		

	}

}
