package day14_Strings_Manipulation;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Computer";
		
		// print all xters one by one
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		System.out.println();
		
		//string word2 and checkif first character is 'J'
		
		String word2 = "Lava";
		
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		System.out.println();
		// String word3 that consists of 5 characters
		// check if first and last characters are same
		// true --> first and last match
		//false --> first and last are different
		
		String word3 = "civic";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		
		if (first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last do not match");
		}
			System.out.println();
			
			//string word4 ==> always print the last xter
			// no matter the length
			
			String word4 = "Automation";
			
			char lastChar = word4.charAt(word4.length()-1);
			System.out.println("Last Char of "+word4+ " is "+lastChar);
			
		
 
	}

}
