package day13_Ternary_Strings_Intro;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		int score = 88;
		
		if (score > 60) {
			result = "pass";
			
		}else {
			result = "fail";
		}
		System.out.println("Result is "+ result);
		
		
		System.out.println();
		
		// USING TERNARY STATEMENT ? TO WRITE ABOVE PROGRAM
		
		result = score > 60 ? "pass" : "fail";
		System.out.println("Result is "+ result);
		
		System.out.println();
		
		// ANOTHER EXAMPLE
		
		String quality = "good";
		
		int rating = ("quality".equals ("good")) ? 100 : 0;
		
		System.out.println("Rating: " + rating);
		
		
		
		
		

	}

}
