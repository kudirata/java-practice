package ReplitAssignments;

import java.util.Scanner;

public class SwitchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DO NOT CHANGE

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command:");
		char response = scan.next().charAt(0);
		// WRITE YOUR CODE HERE
		char y, n, h;

		switch (response) {
		case 'y':
			System.out.println("Your request is being processed");
			break;

		case 'n':
			System.out.println("Thank you anyway for your consideration");
			break;

		case 'h':
			System.out.println("Sorry, no help is currently available");
			break;

		default:
			System.out.println("Invalid entry, please try again!");
			break;
		}

	}

}
