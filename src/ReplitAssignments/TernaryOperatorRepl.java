package ReplitAssignments;

import java.util.Scanner;

public class TernaryOperatorRepl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter number:");
			int x = scan.nextInt();
			//WRITE YOUT CODE HERE
			
	x =	(x >= 5) ? x : -x ; 
	x =	(x < 5) ? -x : x;
			System.out.println(x);

	}

}
