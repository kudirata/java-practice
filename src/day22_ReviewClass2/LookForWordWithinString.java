package day22_ReviewClass2;

public class LookForWordWithinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "IPad am learning java programming. Java is fun. Love Java";
		// Look for "java" in the sentence and print the count.
		
		String sentence2 = "He said hi, then she replied hi. hi guys!";  // how many "hi" in sentence
		// print letters in pairs
		// He
		// e
		// s
		// ai
		
		
		for(int i = 0; i < sentence.length(); i++) {
			String temp = sentence.substring(i, i+2);
			System.out.println(temp);
		}
		
		int count = 0;
		for(int i = 0; i < sentence.length()-1; i++) {
			String temp = sentence.substring(i, i+2);  // 2 letters
			System.out.println(temp);
			if(temp.contentEquals("hi")) {
				count++;
			}
			
		}
		
		// count: 3
		System.out.println("Count: "+count);

	}

}
