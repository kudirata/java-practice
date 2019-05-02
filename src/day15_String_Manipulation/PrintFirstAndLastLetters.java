package day15_String_Manipulation;

import java.util.Scanner;

public class PrintFirstAndLastLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
		
		char a = word.charAt(0);
		System.out.println(a);
		char b = word.charAt(word.length()-1);
		System.out.println(b);
		char result = 'a'+'b';
		System.out.println(result);
		
		

	}

}
