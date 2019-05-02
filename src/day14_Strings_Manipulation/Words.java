package day14_Strings_Manipulation;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter word1");
		
		int lengths;
		
		String word1 = scan.next();
		
		System.out.println("Enter word2");
		String word2 = scan.next();
		
		if(word1.length()> word2.length()) {
			System.out.println(word1+" is longer");
		}else if(word2.length()> word1.length()) {
			System.out.println(word2+" is longer");
		}else {
			System.out.println(word2+" and "+word1+" are same length");
		}
		
		

	}

}
