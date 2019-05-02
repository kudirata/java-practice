package day21_ReviewClass;

import java.util.Scanner;

public class StringsMethodReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word");
		
		String word = scan.next();  //javva
		
		String unique = "";
		
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			//System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique += letter;//add to unique
			}				
			
			
		}
		System.out.println(unique);
		
		//for(int i = 0; i < word.length(); i++) {
		//	System.out.println(i);
			//System.out.println(word.charAt(i));
		//}
		
		

	}

}
