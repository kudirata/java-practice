package day15_String_Manipulation;



public class EmojisWarmUp {

	public static void main(String[] args) {
		// ASSIGNMENT - USE SWITCH CASE METHOD FOR THIS

		
		String emoji = ":)";
		// CHECK IF EMOJI IS NOT EQUAL TO 2 CHARACTERS
		
		if (emoji.length() != 2 ) {
			System.out.println("Invalid Emoji");
			
		return;
			
		}
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first == ':') {
			if (second == ')') {
				System.out.println("Smile");
			}else if(second == '(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("Upset");
			}else if(second == 'p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unknown emoji");
			}	
		}
		
	}

}
