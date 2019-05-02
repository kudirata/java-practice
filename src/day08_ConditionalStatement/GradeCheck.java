package day08_ConditionalStatement;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// A, B, C, D
		// char grade = scan.next().charAt(0);
		//if grade is 'A' print "Excellent job! Keep it up!"
		//else
		//"How many points did you miss for 'A'?
		//int points = scanner
		//print message "Your grade is not good enough."
		//"You could earn more points if you studied harder."
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your Grade?");
		
		char grade = keyboard.next().charAt(0);
		
		if(grade == 'A') {
			System.out.println("Excellent job! Keep it up!");
			
		}else {
			System.out.println("Your grade " +grade+ " is not good enough. ");
			System.out.println("How many points did you miss for 'A'");
			int point = keyboard.nextInt();
			System.out.println("You could earn more points if you worked harder");
		}
		

		
		
		
	}

}
