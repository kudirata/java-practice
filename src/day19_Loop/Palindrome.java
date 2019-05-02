package day19_Loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// e.g Bob, Madam, Civic, Racecar, Anna, Javaj
		
		// to check if word is a palindrome
		// 1) reverse and assign to different string
		// 2) compare if it matches the word
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test");
		String word = scan.next();
		String reverse = "";
		int x = 0;
		int x2 = 0;
		
		// loop through word in reverse order 
		// concatenate each xter to reverse string
		// compare if word and reverse are equal
		
		while(x < word.length()) {     // STARTING FROM BEGINNING
			
			x++;
		}	

		System.out.println();
		
		 x2 = word.length() - 1;   // 5
		while(x2 >= 0 ) {               // STARTING FROM END
			reverse = reverse + word.charAt(x2);
			--x2;
		
		}
		
		System.out.println(reverse);
		
		//compare if word and reversed are equal
		
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("Word is a palindrome");
		}else {
			System.out.println("word is not a palindrome");
		}
	}

}
