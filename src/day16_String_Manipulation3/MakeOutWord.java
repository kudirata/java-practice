package day16_String_Manipulation3;

public class MakeOutWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


				//makeOutWord("<<>>", "Yay") → "<<Yay>>"
				//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
				//makeOutWord("[[]]", "word") → "[[word]]"

		
		String chars = "<<>>";
		String word = "VA";
		String result = chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result);
		
		
		
		
	}

}
