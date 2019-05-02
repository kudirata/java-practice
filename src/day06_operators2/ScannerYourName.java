package day06_operators2;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create scanner object
		Scanner scan = new Scanner (System.in);  //this is called scanner object
		
		System.out.println("Hi What is your name? ");
		
		String name = scan.next();   // accept String input; add line after next i.e. nextline to write firstname and lastname
		
		System.out.println("Nice to meet you, "+ name);
		
		
		
	}

}
