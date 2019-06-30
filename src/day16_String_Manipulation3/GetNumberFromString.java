package day16_String_Manipulation3;

public class GetNumberFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "IPad wrote [236] lines of code today";
		
		// assign to variable and print the number between

		int start = sentence .indexOf('[') + 1;
		int end = sentence.indexOf(']');
		String codeCount = sentence.substring(start, end);
		System.out.println("Lines of code: "+ codeCount);
		
		// all above code can be written in one line as below
		
		//System.out.println("Lines of code: "+ sentence.substring(sentence.indexOf(']'),sentence.indexOf(']'));
		
	}

}
